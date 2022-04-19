package controleur;

import java.util.ArrayList;

import model.Etablissement;

/**
 * Calculs statistiques sur les données de pollution des 
 * polluants N02, PM10 et PM25
 * @author Flavie Tonon
 *
 */
public class StatEtab {

	/**
	 * Calcule la moyenne du polluant N02 pour un département donné
	 * @param l La liste des établissements
	 * @param dpt Le nom du département
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantNO2Dpt(ArrayList<Etablissement> l, String dpt, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy+=e.getPollutionNO2(annee);
			}
		}
		return moy/l.size();
	}

	/**
	 * Calcule la moyenne du polluant PM10 pour un département donné
	 * @param l La liste des établissements
	 * @param dpt Le nom du département
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantPM10Dpt(ArrayList<Etablissement> l, String dpt, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy+=e.getPollutionPM10(annee);
			}
		}
		return moy/l.size();
		
		
	}

	/**
	 * Calcule la moyenne du polluant PM25 pour un département donné
	 * @param l La liste des établissements
	 * @param dpt Le nom du département
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantPM25Dpt(ArrayList<Etablissement> l, String dpt, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy+=e.getPollutionPM25(annee);
			}
		}
		return moy/l.size();
	}
	
	public double getPourcentageNO2(ArrayList<Etablissement> l, String dpt, int annee){
		double moy1 = 0;
		double moy2 = 0;
		double calcul = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy1+=e.getPollutionNO2(annee);
				moy2+=e.getPollutionNO2(annee+1);
				
				moy1 = moy1/l.size();
				moy2 = moy2/l.size();
				
				calcul = (moy1 - moy2) / moy2 * 100;
			}
		}
		return calcul;
		
	}
	
	public double getPourcentagePM10(ArrayList<Etablissement> l, String dpt, int annee){
		double moy1 = 0;
		double moy2 = 0;
		double calcul = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy1+=e.getPollutionPM10(annee);
				moy2+=e.getPollutionPM10(annee+1);
				
				moy1 = moy1/l.size();
				moy2 = moy2/l.size();
				
				calcul = (moy1 - moy2) / moy2 * 100;
			}
		}
		return calcul;
		
	}
	
	public double getPourcentagePM25(ArrayList<Etablissement> l, String dpt, int annee){
		double moy1 = 0;
		double moy2 = 0;
		double calcul = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy1+=e.getPollutionPM25(annee);
				moy2+=e.getPollutionPM25(annee+1);
				
				moy1 = moy1/l.size();
				moy2 = moy2/l.size();
				
				calcul = (moy1 - moy2) / moy2 * 100;
			}
			
		}
		return calcul;
	}
	
	/**
	 * Calcule la moyenne du polluant N02 pour une ville donnée
	 * @param l La liste des établissements
	 * @param ville Le nom de la ville
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantNO2Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionNO2(annee);
			}
		}
		return moy/l.size();
	}

	/**
	 * Calcule la moyenne du polluant PM10 pour une ville donnée
	 * @param l La liste des établissements
	 * @param ville Le nom de la ville
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantPM10Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionPM10(annee);
			}
		}
		return moy/l.size();
	}
	
	/**
	 * Calcule la moyenne du polluant PM25 pour une ville donn�e
	 * @param l La liste des �tablissements
	 * @param ville Le nom de la ville
	 * @param annee L'ann�e de r�colte des donn�es demand�e
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantPM25Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionPM25(annee);
			}
		}
		return moy/l.size();
	}
	
	/**
	 * Trouve l'�tablissement le plus polluant au NO2 sur une ann�e
	 * @param l La liste des �tablissements
	 * @param annee L'ann�e de r�colte des donn�es demand�e
	 * @return L'�tablissement le plus polluant au N02
	 * Flavie Tonon
	 */
	public static Etablissement getPlusPolluantNO2(ArrayList<Etablissement> l, int annee) {
		//TODO Compl�ter getPlusPolluantNO2 
		Etablissement etablissementLePlusPolluant;
		etablissementLePlusPolluant = l.get(0);
		for (Etablissement e : l) {
			if (e.getPollutionNO2(annee)>etablissementLePlusPolluant.getPollutionNO2(annee)){
				etablissementLePlusPolluant = e;
			}
		}
		return etablissementLePlusPolluant;
	}
	/**
	 * Trouve l'�tablissement le plus polluant au PM10 sur une ann�e
	 * @param l La liste des �tablissements
	 * @param annee L'ann�e de r�colte des donn�es demand�e
	 * @return L'�tablissement le plus polluant au PM10
	 * Flavie Tonon
	 */
	public static Etablissement getPlusPolluantPM10(ArrayList<Etablissement> l, int annee) {
		Etablissement etablissementLePlusPolluant;
		etablissementLePlusPolluant = l.get(0);
		for (Etablissement e : l) {
			if (e.getPollutionPM10(annee)>etablissementLePlusPolluant.getPollutionPM10(annee)){
				etablissementLePlusPolluant = e;
			}
		}
		return etablissementLePlusPolluant;
	}
	/**
	 * Trouve l'�tablissement le plus polluant au PM25 sur une ann�e
	 * @param l La liste des �tablissements
	 * @param annee L'ann�e de r�colte des donn�es demand�e
	 * @return L'�tablissement le plus polluant au PM25
	 * Flavie Tonon
	 */
	public static Etablissement getPlusPolluantPM25(ArrayList<Etablissement> l, int annee) {
		Etablissement etablissementLePlusPolluant;
		etablissementLePlusPolluant = l.get(0);
		for (Etablissement e : l) {
			if (e.getPollutionPM25(annee)>etablissementLePlusPolluant.getPollutionPM25(annee)){
				etablissementLePlusPolluant = e;
			}
		}
		return etablissementLePlusPolluant;
	}
	
	
	/*public static double getMoyennePolluantPM10Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionPM10(annee);
			}
		}
		return moy/l.size();
	}
	
	public static double getMoyennePolluantPM10Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionPM10(annee);
			}
		}
		return moy/l.size();
	}
	
	public static double getMoyennePolluantPM10Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionPM10(annee);
			}
		}
		return moy/l.size();
	}*/
}
