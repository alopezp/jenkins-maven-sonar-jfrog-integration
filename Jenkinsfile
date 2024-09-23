pipeline {
    agent any
    environment {
      CIUDAD = 'Madrid'
      REPO_URL = 'https://github.com/alopezp/jenkins-maven-sonar-jfrog-integration'
      IN_FILE_NAME = 'valores.txt'
      OUT_FILE_NAME = 'resultado.txt'
      DESTINATION_PATH = '/Users/adrian/Documents/CursoDevOps/'
    }

    stages {
      stage('Clonar Repositorio') {
        steps {
          git branch: 'feature/finalExam', url: "${env.REPO_URL}"
        }
      }
      
      stage('Leer Archivo') {
        steps {
          script {
            def fileContent = readFile("${env.IN_FILE_NAME}")
            def lines = fileContent.split("\n")
            env.LINE_0 = lines[0]
            env.LINE_1 = lines[1]
            env.LINE_2 = lines[2]
            env.LINE_3 = lines[3]
          }
        }
      }
      
      stage('Calcular Población Final (Lunes)') {
        when {
          expression { return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.MONDAY }
        }
        steps {
          script {
            def calcularPoblacionFinal = { valor -> return valor.toFloat() * 0.80 }
            def poblacionFinal = calcularPoblacionFinal(env.LINE_0)
            echo "Población Final: ${poblacionFinal}"
          }
        }
      }
      
      stage('Operaciones Aritméticas (Martes)') {
        when {
          expression { return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.MONDAY }
        }
        steps {
          script {
            def sumar = { a, b -> return a.toFloat() + b.toFloat() }
            def restar = { a, b -> return a.toFloat() - b.toFloat() }
            def multiplicar = { a, b -> return a.toFloat() * b.toFloat() }
            def dividir = { a, b -> return b.toFloat() != 0 && a.toFloat() != 0 ? a.toFloat() / b.toFloat() : "Error, división por cero" }

            def suma = sumar(env.LINE_1, env.LINE_2)
            def resta = restar(env.LINE_1, env.LINE_2)
            def multiplicacion = multiplicar(env.LINE_1, env.LINE_2)
            def division = dividir(env.LINE_1, env.LINE_2)

            echo "Suma: ${suma}, Resta: ${resta}, Multiplicación: ${multiplicacion}, División: ${division}"
            escribirResultado("Suma: ${suma}, Resta: ${resta}, Multiplicación: ${multiplicacion}, División: ${division}")
          }
        }
      }
      
      stage('Convertir Grados F a C (Miércoles)') {
        when {
          expression { return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.MONDAY }
        }
        steps {
          script {
            def convertirFtoC = { f -> return (f.toFloat() - 32) * 5 / 9 }
            def celsius = convertirFtoC(env.LINE_3)
            echo "Temperatura en Celsius: ${celsius}"
            escribirResultado("Temperatura en Celsius: ${celsius}")
          }
        }
      }
      
      stage('Información del Usuario (Jueves)') {
        when {
          expression { return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.MONDAY }
        }
        steps {
          def user = currentBuild.getBuildCauses('hudson.model.Cause$UserIdCause')[0]?.userId
          echo "El pipeline fue ejecutado por: ${user ?: 'Usuario desconocido'}"
        }
      }
      
      stage('Proyecto Maven (Viernes)') {
        when {
          expression { return java.time.LocalDate.now().dayOfWeek == java.time.DayOfWeek.MONDAY }
        }
        steps {
          dir('proyecto-maven') {
            script {
              sh '''
              git checkout feature/dummy-app
              mvn clean install
              '''
            }                    
          }
        }
      }
    }

    def escribirResultado(texto) {
      script {
        def resultado = "${texto}\n"
        writeFile file: "${env.DESTINATION_PATH}/${env.OUT_FILE_NAME}", text: resultado, append: true
      }
    }

    post {
      success {
        echo 'Pipeline ejecutado correctamente.'
      }
      always {
        echo 'Pipeline finalizado.'
      }
      failure {
        echo 'ERROR: El pipeline contiene errores.'
      }
    }
}
