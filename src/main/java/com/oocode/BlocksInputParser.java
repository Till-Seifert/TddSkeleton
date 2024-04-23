package com.oocode;

public class BlocksInputParser {
    private Robot robot;

    public BlocksInputParser(Robot robot) {
        this.robot = robot;
    }

    public void parse(String input) {
        String[] arrParsedString = input.split(" ");
        if (arrParsedString.length != 4) {
            if (arrParsedString[0].equalsIgnoreCase("quit")){
                robot.quit();
                return;
            }
        }
        String command = arrParsedString[0].concat(arrParsedString[2]).toLowerCase();
        switch (command) {
            case "moveover":
                this.robot.moveOver(Integer.parseInt(arrParsedString[1]),Integer.parseInt(arrParsedString[3]));
                break;
            case "moveonto":
                this.robot.moveOnto(Integer.parseInt(arrParsedString[1]),Integer.parseInt(arrParsedString[3]));
                break;
            case "pileover":
                this.robot.pileOver(Integer.parseInt(arrParsedString[1]),Integer.parseInt(arrParsedString[3]));
                break;
            case "pileonto":
                this.robot.pileOnto(Integer.parseInt(arrParsedString[1]),Integer.parseInt(arrParsedString[3]));
                break;
        }
    };
}
