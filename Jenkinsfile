import java.time.LocalDate

pipeline {
    agent any

    environment {
        FECHA = new Date().format('YYYY-MM-dd')
        CIUDAD = "MADRID"
        POBLACION = 9000000
        CLIMA = "Soleado"  
        SALIDA = "/Users/adrian/Documents/CursoDevOps/exam04_salida_${env.FECHA}.txt"

    }

    stages {
        stage('Mensaje de Bienvenida') {
            steps {
                script {
                    echo "Bienvenido! Hoy estamos a día ${env.FECHA}"
                }
            }
        }

        stage('Información de la Ciudad') {
            steps {
                script {
                    echo "Clima actual en ${env.CIUDAD}: ${env.CLIMA}"
                    echo "Población actual en ${env.CIUDAD}: ${env.POBLACION}"
                }
            }
        }

        stage('Calcular Población Neta') {
            steps {
                script {
                    def poblacionNeta = env.POBLACION.toInteger() * 0.8
                    echo "Población neta (80% de la población actual): ${poblacionNeta}"
                    writeFile file: env.SALIDA, text: """
                    Fecha: ${env.FECHA}
                    Ciudad: ${env.CIUDAD}
                    Clima: ${env.CLIMA}
                    Población actual: ${env.POBLACION}
                    Población neta: ${poblacionNeta}
                    """
                }
            }
        }
    }

    post {
        always {
            echo "Pipeline completado. El archivo ${env.SALIDA} ha sido generado."
        }
    }
}
