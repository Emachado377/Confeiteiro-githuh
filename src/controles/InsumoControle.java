package controles;

import java.util.ArrayList;

import apresentacoes.InsumoApresentacao;
import modelos.Insumo;

public class InsumoControle {
	
	public static ArrayList<Insumo> listaInsumos = new ArrayList<Insumo>();
    public static  String[] options = { "kg","grama", "litro","ml", "duzia", "metro","centimetro", "milimetro"};
    
	
	public static void adicionaInsumo () {
		Insumo insumo = new Insumo();
		InsumoApresentacao.cadastraInsumo(insumo, options);
		listaInsumos.add(insumo);
	}
	public static void listaInsumo(){
		String listaNomeInsumoTemporaria = "";
		int n = listaInsumos.size(); 
		for(int i =0; i<n; i++){
			listaNomeInsumoTemporaria+= Integer.toString(i)+ " - " +
					listaInsumos.get(i).getNome()+"  =  "+ listaInsumos.get(i).getValor() +" /  "+ listaInsumos.get(i).getUnidadeMedida() + "\n\n";
		}
		InsumoApresentacao.listaInsumo(listaNomeInsumoTemporaria);
	}
	
			
		
	public static void populaInsumos(String nome, String unidadeMedida, Double valor) {
		Insumo insumo = new Insumo();
		insumo.setNome(nome);
		insumo.setUnidadeMedida(unidadeMedida);
		insumo.setValor(valor);
		listaInsumos.add(insumo);
	}
}
