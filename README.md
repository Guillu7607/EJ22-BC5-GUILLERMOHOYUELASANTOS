# Resumen
Este proyecto consiste en una aplicación de escritorio básica desarrollada en Java utilizando JavaFX.
El objetivo central del ejercicio es aprender a implementar un cuadro de diálogo de selección única basada en una lista desplegable (ChoiceDialog),
permitiendo al usuario escoger un elemento predefinido de forma interactiva y segura.
# Características
Diálogo de Selección Modular: Utiliza la clase ChoiceDialog para renderizar un menú desplegable (ComboBox/ChoiceBox) incrustado dentro de una ventana emergente modal.

Valor por Defecto: Configura de manera nativa una opción preseleccionada para guiar la interacción inicial del usuario.

Layout Limpio: Organiza una etiqueta descriptiva (Label) y el botón de acción en una columna vertical ordenada mediante un contenedor VBox con un espaciado de 10 píxeles.

Control de Flujo con Optional: Emplea la estructura funcional Optional<String> junto a una expresión Lambda para consumir la opción seleccionada únicamente si el usuario confirma la acción ("Aceptar").
