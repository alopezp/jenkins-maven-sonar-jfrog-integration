pipeline {
    agent any

    environment {
        OUTPUT_FILE = "/Users/adrian/Documents/CursoDevOps/exam03_salida_${new Date().format('yyyy-MM-dd')}.txt"
    }

    stages {
        stage('Generar cuadrados de números') {
            steps {
                script {
                    def resultados = ""
                    for (int i = 2; i <= 11; i++) {
                        def cuadrado = i * i
                        echo "${i} = ${cuadrado}"
                        resultados += "${i} = ${cuadrado}\n"
                    }
                    writeFile file: env.OUTPUT_FILE, text: resultados
                }
            }
        }
    }

    post {
        always {
            echo "Pipeline completado."
        }
    }
}
