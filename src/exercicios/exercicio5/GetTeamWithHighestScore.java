package exercicios.exercicio5;

import java.util.HashMap;
import java.util.Map;

public class GetTeamWithHighestScore {
	 public String getTeamWithHighestScore(Map<String, Integer> scores) {
	        String highestScoreTeam = null;
	        int highestScore = Integer.MIN_VALUE;
	        
	        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
	            String team = entry.getKey();
	            int score = entry.getValue();
	            
	            if (score > highestScore) {
	                highestScore = score;
	                highestScoreTeam = team;
	            }
	        }
	        
	        return highestScoreTeam;
	    }
	    
	    public static void main(String[] args) {
	    	GetTeamWithHighestScore scoreAnalyzer = new GetTeamWithHighestScore();
	        
	        // Exemplo de pontuações dos times
	        Map<String, Integer> teamScores = new HashMap<String, Integer>();
	        teamScores.put("TeamA", 45);
	        teamScores.put("TeamB", 60);
	        teamScores.put("TeamC", 52);
	        teamScores.put("TeamD", 72);
	        teamScores.put("TeamE", 63);
	        
	        String teamWithHighestScore = scoreAnalyzer.getTeamWithHighestScore(teamScores);
	        System.out.println("Time com a maior pontuação: " + teamWithHighestScore);
	    }
}
