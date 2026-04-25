package com.moviles.examenmoviles.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moviles.examenmoviles.ui.components.AppBottomBar
import com.moviles.examenmoviles.ui.screens.SpaceDetailScreen
import com.moviles.examenmoviles.ui.screens.SpaceListScreen
import com.moviles.examenmoviles.viewmodel.CoworkingViewModel

object Routes {
    const val SPACE_LIST = "spaces"
    const val SPACE_DETAIL = "spaces/{spaceId}"
    fun spaceDetail(id: Int) = "spaces/$id"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val viewModel: CoworkingViewModel = viewModel()
    val spaces by viewModel.spaces.collectAsState()

    NavHost(navController = navController, startDestination = Routes.SPACE_LIST) {
        composable(Routes.SPACE_LIST) {
            SpaceListScreen(
                spaces = spaces,
                bottomBar = { AppBottomBar(navController) },
                onSpaceClick = { spaceId ->
                    navController.navigate(Routes.spaceDetail(spaceId))
                }
            )
        }
        composable(Routes.SPACE_DETAIL) { backStackEntry ->
            val spaceId = backStackEntry.arguments?.getString("spaceId")?.toIntOrNull()
            val space = spaceId?.let { viewModel.getSpaceById(it) }
            if (space != null) {
                SpaceDetailScreen(
                    space = space,
                    bottomBar = { AppBottomBar(navController) },
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}
