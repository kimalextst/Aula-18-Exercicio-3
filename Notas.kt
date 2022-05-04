package exercicio3

class Notas (
    notaParametro : Double = 0.0
        ){
    private var notaBimestre = notaParametro
    private var listaNotas : ArrayList <Notas> = ArrayList()
    private var mediaAluno : Double = 0.0

    fun introducao() {
        println("Bem-vinde. Vamos calcular médias? :]")
        println("(Lembrando que a média é 7 ^^)")
        println("--------------------------------------------")
    }

    fun pegarEVerificarNotas(){
        println("--------------------------------------------")
        for(contador in 1..4){
            print("Insira a $contador° nota: ")
            var nota = readln().toDouble()

            while (nota < 0 || nota > 10){
                println("-----------------------------------")
                println("Número inválido! Tente novamente.")
                println("-----------------------------------")
                print("Insira a $contador° nota: ")
                nota = readln().toDouble()
            }

            val notaInserida = Notas(notaParametro = nota)
            inserirNotaLista(notaInserida)
        }
        println("--------------------------------------------")
        calculaMedia()
    }

    private fun inserirNotaLista(notaInserida : Notas){
        listaNotas.add(notaInserida)
    }

    private fun calculaMedia(){
        var soma = 0.0

        listaNotas.forEach{ nota ->
            soma += nota.notaBimestre
        }

        mediaAluno = soma / 4

        mostrarNotasEMedia()
    }

    fun verificarAprovacao(): String {
        val resposta : String
        if (mediaAluno < 7){
            resposta = "(Reprovado)"
        } else {
            resposta = "(Aprovado)"
        }

        return resposta
    }

    private fun mostrarNotasEMedia(){
        println("--------------------------------------------")
        var bimestre = 0
        listaNotas.forEach{nota ->
            bimestre += 1
            println("Nota do ${bimestre}° Bimestre: ${nota.notaBimestre}")
        }

        println("--------------------------------------------")
        println("A média anual do aluno é: $mediaAluno")
        println(verificarAprovacao())
        println("--------------------------------------------\n")
    }
}