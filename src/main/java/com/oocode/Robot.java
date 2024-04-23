package com.oocode;

public interface Robot {
    void moveOnto(int source, int destination);
    void moveOver(int source, int destination);
    void pileOnto(int source, int destination);
    void pileOver(int source, int destination);
    void quit();
}
