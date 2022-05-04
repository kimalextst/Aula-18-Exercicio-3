package exercicio3

import kotlin.system.exitProcess

class Menu {
    fun miniMenu(){
        println("--------------------MENU--------------------\n")
        println("-------------------OPÇÕES-------------------")
        println("* Se deseja calcular uma nova média, digite 1")
        println("* Se deseja sair, digite 2")
        println("--------------------------------------------")
        val escolha = readln().toInt()

        escolhaMenu(escolha)
    }

    private fun escolhaMenu(escolha : Int){
        val objetoNotas : Notas = Notas()

        when(escolha){
            1 -> {
                objetoNotas.pegarEVerificarNotas()
                miniMenu()
            }
            2 -> exitProcess(0)
            else -> {
                println("-----------------------------------")
                println("Número inválido! Tente novamente.")
                println("-----------------------------------")
                miniMenu()
            }
        }
    }
}