# Diseño de UI

## Estructura de la Interfaz Implementada

La interfaz de la aplicación está organizada en dos pantallas principales conectadas mediante navegación con `NavHost`. La primera es la pantalla de listado (`SpaceListScreen`), que muestra todos los espacios disponibles usando un `LazyColumn`, y la segunda es la pantalla de detalle (`SpaceDetailScreen`), que se abre al seleccionar cualquier espacio de la lista y muestra su información completa junto con un botón para realizar la reservación. Ambas pantallas comparten una barra de navegación inferior (`AppBottomBar`) que permanece visible en todo momento, lo que le permite al usuario saber siempre en qué sección se encuentra y moverse entre las áreas principales de la app.

## Lista de Composables Creados

### Screens (Pantallas Completas)

- **`SpaceListScreen`**: Pantalla principal que utiliza `Scaffold`, `TopAppBar` y `LazyColumn` para mostrar el listado de espacios de coworking disponibles.
- **`SpaceDetailScreen`**: Pantalla de detalle que utiliza `Scaffold`, `TopAppBar` con botón de regreso, `Column` con scroll, `Image`, y un `Button` para reservar el espacio seleccionado.

### Components (Componentes Reutilizables)

- **`AppBottomBar`**: Barra de navegación inferior construida con `NavigationBar` y dos `NavigationBarItem`. Se inyecta en ambas pantallas como parámetro lambda.
- **`SpaceCard`**: Tarjeta de presentación de cada espacio en el listado. Combina `Card`, `Image`, `Row`, `Column`, `Text`, `Icon` y el componente `AvailabilityBadge`.
- **`AvailabilityBadge`**: Componente pequeño que muestra el estado de disponibilidad del espacio (verde para disponible, rojo para ocupado) mediante un `Box` con fondo de color redondeado.

### Composables Internos

- **`SpaceDetailRow`** *(private)*: Composable auxiliar dentro de `SpaceDetailScreen` que representa cada fila de detalle (capacidad, precio) con un ícono, etiqueta y valor.

### Navegación

- **`AppNavigation`**: Composable raíz que inicializa el `NavHostController`, el `CoworkingViewModel` y el `NavHost` con las dos rutas definidas en el objeto `Routes`.

## Identificación de Componentes Reutilizables

Los componentes diseñados para ser reutilizados en múltiples partes de la aplicación son los siguientes:

- **`AppBottomBar`**: Se reutiliza en `SpaceListScreen` y `SpaceDetailScreen`. Para evitar duplicar código y mantener un comportamiento consistente, se pasa como un parámetro `@Composable () -> Unit` a cada pantalla.
- **`SpaceCard`**: Se reutiliza dentro del `LazyColumn` de `SpaceListScreen`, una instancia por cada espacio en la lista de datos simulados.
- **`AvailabilityBadge`**: Se reutiliza tanto en `SpaceCard` (dentro del listado) como en `SpaceDetailScreen` (dentro de la vista de detalle), garantizando que la presentación del estado de disponibilidad sea siempre consistente visualmente.

## Justificación de la Organización de la Interfaz

La decisión de separar los archivos en carpetas `screens/` y `components/` responde a uno de los principios más importantes en el desarrollo con Jetpack Compose: que cada composable tenga una responsabilidad única y clara. Las pantallas se encargan de estructurar el contenido completo de una vista mediante `Scaffold`, mientras que los componentes son piezas independientes que no saben nada del contexto en el que van a ser usadas, lo cual las hace reutilizables y fáciles de mantener.

Por otro lado, la decisión de inyectar el `AppBottomBar` como parámetro lambda a cada pantalla, en lugar de tener un solo `Scaffold` global, responde a la necesidad de mantener cada pantalla autónoma y con control total de su estructura visual. Esto evita el anidamiento de `Scaffold`, que es una práctica que Jetpack Compose no recomienda porque puede generar comportamientos inesperados con los paddings internos.
