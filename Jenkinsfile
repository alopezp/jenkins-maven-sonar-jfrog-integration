pipeline {
    agent any

    environment {
        FILE_PATH = '/Users/adrian/Documents/CursoDevOps/'  
        FECHA_NACIMIENTO = '1980-09-17'  
    }
   
    stages {
        stage('Calcular Edad') {
            steps {
                script {
                    def currentYear = new Date().format('yyyy').toInteger()
                    def birthYear = new Date(env.FECHA_NACIMIENTO).format('yyyy').toInteger()
                    def edad = currentYear - birthYear
                    echo "La edad calculada es: ${edad}"
                    env.EDAD = edad.toString() 
                }
            }
        }

        stage('Generar Txt') {
            steps {
                script {
                    def fileName = "edad_calculada_${new Date().format('yyyy-MM-dd')}.txt"
                    writeFile file: "${env.FILE_PATH}/${fileName}", text: "Edad calculada: ${env.EDAD}"
                    echo "Archivo ${fileName} creado en ${env.FILE_PATH}"
                }
            }
        }
    }
}
