package game;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;
import javax.swing.*;

import gameInterface.FirstFrame;
import gameInterface.Intro;


public class PongGame{
	

	public static void main(String[] args) throws InterruptedException {
//		GameMode mode=GameMode.Classic;
		GameMode mode=GameMode.Advanced;
		GameFrame frame=new GameFrame(mode);
		//new Thread(new Client()).start();		
		
//		FirstFrame frame=new FirstFrame();
//		Intro intro=new Intro();
	}
}
