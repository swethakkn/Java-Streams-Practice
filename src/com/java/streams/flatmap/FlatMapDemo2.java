package com.java.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Vihaan","Rithwik");
		List<String> teamB = Arrays.asList("Advith","Varun");
		List<String> teamC = Arrays.asList("Chikku","Baby");
		
		List<List<String>> allTeamList = Arrays.asList(teamA,teamB,teamC);
		//All team list in one collection
		//Before Java 1.8
		
		for(List<String> team:allTeamList) {
			for(String name : team) {
				System.out.println(name); // we can add this to collection by declaring above
			}
		}
		
		// After Java1.8 using streams and flatMap
		List<String> members = allTeamList.stream().flatMap(team -> team.stream()).collect(Collectors.toList());
		System.out.println(members);
		

	}

}
