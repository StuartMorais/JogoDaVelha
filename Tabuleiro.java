
public class Tabuleiro {

	public String[][] tabuleiro = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	//------------------------------------------------------TABELA
	public String exibirTabuleiro()
	{
		for(int li= 0; li<3; li++)
		{
			for (int col=0; col<3; col++)
			{
				System.out.printf(" "+ tabuleiro[li][col]);
				
			}
			System.out.println("\n");
		}
		return null;
	}
	//------------------------------------------------------VALIDAÇÃO
	public boolean Valido(String P)
	{
		for(int li= 0; li<3; li++)
		{
			for (int col=0; col<3; col++)
			{
				if(tabuleiro[li][col].equals(P))
					return true;
			}
		}
		return false;
	}
	
	
	//------------------------------------------------------JOGADA
	public void jogada(String P, String S)
	{
		//----------------------------------PRIMEIRA LINHA
		if(P.equals("1"))
		{
			tabuleiro[0][0]=S;
		}
		
		else if(P.equals("2"))
		{
			tabuleiro[0][1]=S;
		}
		
		else if(P.equals("3"))
		{
			tabuleiro[0][2]=S;
		}
		//---------------------------------SEGUNDA LINHA
		else if(P.equals("4"))
		{
			tabuleiro[1][0]=S;
		}
		
		else if(P.equals("5"))
		{
			tabuleiro[1][1]=S;
		}
		
		else if(P.equals("6"))
		{
			tabuleiro[1][2]=S;
		}
		//---------------------------------TERCEIRA LINHA
		else if(P.equals("7"))
		{
			tabuleiro[2][0]=S;
		}
		
		else if(P.equals("8"))
		{
			tabuleiro[2][1]=S;
		}
		
		else if(P.equals("9"))
		{
			tabuleiro[2][2]=S;
		}
	}
	//------------------------------------VERIFICAÇÂO DE VITORIA
	public String Vencendor(int jogadas)
	{
		String[] V = new String[8];
		
		String Ganhador = "null";
		
		if(jogadas == 9) 
		{
			Ganhador = "EMPATE";
		}
		//-----------------------------------------------------------VITORIAS PELA HORIZONTAL
		V[0] = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2];
		V[1] = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2];
		V[2] = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];
		//-----------------------------------------------------------VITORIAS PELA VERTICAL
		V[3] = tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0];
		V[4] = tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1];
		V[5] = tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2];
		//-----------------------------------------------------------VITORIAS PELA DIAGONAL
		V[6] = tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];
		V[7] = tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0];
		
		for(int i=0; i<V.length; i++)
		{
			if(V[i].equals("XXX"))
				Ganhador = "Jogador 1";
			
			else if(V[i].equals("OOO"))
				Ganhador = "Jogador 2";
		}
		return Ganhador;
			
	}
	
}

