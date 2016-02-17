package fr.ece.pambourg.main;

import java.util.Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
	
	private ObservableList<String> obs = FXCollections.observableArrayList();
	
	public boolean add (String s)
	{
		return this.obs.add(s);
	}
	public ObservableList<String> items()
	{
		FXCollections.sort(this.obs);
		return obs;
		
	}
}