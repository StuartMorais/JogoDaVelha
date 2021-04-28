import java.util.Scanner;

public class JogoDaVelha {
	
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		Tabuleiro jogo = new Tabuleiro();
		String posicao;
		int valida=0, jogadas=0;
		
			while(true)
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~");
				System.out.println("~  JOGO DA VELHA  ~");
				System.out.println("~~~~~~~~~~~~~~~~~~~");
				
				jogo.exibirTabuleiro();
				
				System.out.println("~~~~~~~~~~~~~~~~~~~");
				
				do//----INICIADOR DO JOGADOR 1
				{
					System.out.print("Jogador, informe a posição: ");
					posicao = key.nextLine();
					
					while(!jogo.Valido(posicao))
					{
						System.out.println("Jogada inválida, Tente Novamente");
						System.out.print("Jogador, informe a posição: ");
						posicao = key.nextLine();
						valida = 0;
					}
					jogo.jogada(posicao, "X");
					valida = 1;
					
				}while(valida == 0);//------FINAL DO JOGADOR 1
				
				jogadas++;
				valida = 0;
				jogo.exibirTabuleiro();
				
				if(!jogo.Vencendor(jogadas).equals("null"))
				{
					break;
				}

				do//----INICIADOR DO JOGADOR 2
				{
					System.out.print("Jogador, informe a posição: ");
					posicao = key.nextLine();
					
					while(!jogo.Valido(posicao))
					{
						System.out.println("Jogada inválida, Tente Novamente");
						System.out.print("Jogador, informe a posição: ");
						posicao = key.nextLine();
						valida = 0;
					}
					jogo.jogada(posicao, "O");
					valida = 1;
					
				}while(valida == 0);//------FINAL DO JOGADOR 2
				
				jogadas++;
				valida = 0;
				jogo.exibirTabuleiro();
				
				if(!jogo.Vencendor(jogadas).equals("null"))
				{
					break;
				}
			}
			if(jogo.Vencendor(jogadas)=="EMPATE") 
			{
				System.out.println("EMPATE");
			}
			else
			System.out.print("O "+jogo.Vencendor(jogadas)+" venceu!");
		}
	}
