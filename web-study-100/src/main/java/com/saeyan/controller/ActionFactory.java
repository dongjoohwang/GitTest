package com.saeyan.controller;


import com.saeyan.controller.action.Action;
import com.saeyan.controller.action.BoardListActoin;

public class ActionFactory {
	
	private static ActionFactory instance = new ActionFactory();
	public ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	public Action getAction(String command) {
		Action action = null;
		System.out.println("Actionfactory :"+ command);
		//�߰��� �κ�
		if(command.equals("board_list")) {
			action = new BoardListActoin();
		}
		return action;
	}
}
