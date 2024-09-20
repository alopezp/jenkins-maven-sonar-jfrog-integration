pipeline {
    agent any

    environment {
        INPUT_FILE = '/Users/adrian/Documents/CursoDevOps/exam02_input.txt'
        OUTPUT_FILE = '/Users/adrian/Documents/CursoDevOps/exam02_resultados.txt'
    }

    stages {
        stage('Leer archivo y realizar cálculos') {
            steps {
                script {
                    def inputFileContent = readFile(env.INPUT_FILE).trim().split(',')
                    def num1 = inputFileContent[0].toInteger()
                    def num2 = inputFileContent[1].toInteger()

                    def suma = num1 + num2
                    def resta = num1 - num2
                    def multiplicacion = num1 * num2
                    def division = (num2 != 0 && num1 != 0) ? (num1 / num2) : "División por 0 no permitida"

                    echo "Suma: ${suma}"
                    echo "Resta: ${resta}"
                    echo "Multiplicación: ${multiplicacion}"
                    echo "División: ${division}"

                    def resultados = """
                        Suma: ${suma}
                        Resta: ${resta}
                        Multiplicación: ${multiplicacion}
                        División: ${division}
                    """
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
