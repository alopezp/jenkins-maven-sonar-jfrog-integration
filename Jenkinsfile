pipeline {
    agent any
    
    environment {
        CIUDAD = 'Madrid' 
    }

    stages {
        stage('Calculos Matematicos (Lunes)') {
            when {
                expression { 
                    return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.MONDAY 
                }
            }
            steps {
                echo "Suma: ${2 + 3}"
                echo "Resta: ${5 - 3}"
                echo "Multiplicación: ${2 * 3}"
                echo "División: ${6 / 2}"
            }
        }

        stage('Información del Usuario (Martes)') {
            when {
                expression { 
                    return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.TUESDAY
                }
            }
            steps {
                echo "Usuario que ejecutó: ${env.BUILD_USER}"
                echo "Fecha de ejecución: ${java.time.LocalDateTime.now()}"
            }
        }

        stage('Mensaje de Ejecución (Miércoles)') {
            when {
                expression { 
                    return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.WEDNESDAY 
                }
            }
            steps {
                echo "Se ha ejecutado el pipeline."
            }
        }

        stage('Clima (Jueves)') {
            when {
                expression { 
                    return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.THURSDAY
                }
            }
            steps {
                echo "El clima actual en ${env.CIUDAD} es soleado con 25 grados."
            }
        }

        stage('Motivación (Viernes)') {
            when {
                expression { 
                    return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.FRIDAY
                }
            }
            steps {
                echo "Lo estás haciendo de maravillas!"
            }
        }
    }

    post {
        always {
            echo 'Pipeline completado.'
        }
    }
}
