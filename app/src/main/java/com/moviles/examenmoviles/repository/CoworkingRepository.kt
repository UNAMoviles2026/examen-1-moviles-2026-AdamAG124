package com.moviles.examenmoviles.repository

import com.moviles.examenmoviles.data.mock.CoworkingSpaceMock
import com.moviles.examenmoviles.model.CoworkingSpace

class CoworkingRepository {
    fun getSpaces(): List<CoworkingSpace> = CoworkingSpaceMock.spaces

    fun getSpaceById(id: Int): CoworkingSpace? = CoworkingSpaceMock.spaces.find { it.id == id }
}
