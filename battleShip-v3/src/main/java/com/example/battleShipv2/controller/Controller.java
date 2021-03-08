package com.example.battleShipv2.controller;

import com.example.battleShipv2.model.Board;
import com.example.battleShipv2.GUI.IWindow;

public class Controller {
    Board player;
    Board computer;

    IWindow window;

    public Controller(int boardSize) {
        player = new Board(boardSize);
        computer = new Board(boardSize);
    }
}
