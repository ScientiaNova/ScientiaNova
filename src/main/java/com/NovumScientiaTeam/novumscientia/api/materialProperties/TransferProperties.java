package com.NovumScientiaTeam.novumscientia.api.materialProperties;

public class TransferProperties {
    private int capacity;
    private int transferSpeed;

    public TransferProperties(int capacity, int transferSpeed) {
        this.capacity = capacity;
        this.transferSpeed = transferSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTransferSpeed() {
        return transferSpeed;
    }
}