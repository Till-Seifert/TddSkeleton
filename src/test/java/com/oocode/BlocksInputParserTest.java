package com.oocode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BlocksInputParserTest {

    @Test
    public void canParseMoveOntoCommands() {
        Robot robot = mock(Robot.class);
        var parser = new BlocksInputParser(robot);

        parser.parse("move 3 onto 7");

        verify(robot).moveOnto(3, 7);

        parser.parse("move 2 onto 3");

        verify(robot).moveOnto(2, 3);
    }

    @Test
    public void canParseMoveOverCommands() {
        Robot robot = mock(Robot.class);
        var parser = new BlocksInputParser(robot);

        parser.parse("move 3 over 7");

        verify(robot).moveOver(3, 7);
    }

    @Test
    public void canParsePileOntoCommands() {
        Robot robot = mock(Robot.class);
        var parser = new BlocksInputParser(robot);

        parser.parse("pile 3 onto 7");

        verify(robot).pileOnto(3, 7);
    }

    @Test
    public void canParsePileOverCommands() {
        Robot robot = mock(Robot.class);
        var parser = new BlocksInputParser(robot);

        parser.parse("pile 3 over 7");

        verify(robot).pileOver(3, 7);
    }

    @Test
    public void canParseQuit() {
        Robot robot = mock(Robot.class);
        var parser = new BlocksInputParser(robot);

        parser.parse("quit");

        verify(robot).quit();
    }
}