package org.ipfsbox.library.entity;

import java.util.List;

public class Id {

    /**
     * ID : Qmc6ixYBnr6t9Er4UhFjjgS5r95K2nMbf3yqNwq56R1Juc
     * PublicKey : CAASpgIwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCf1o2zB2X6gTIQyQxat36UDjSkDSD6/wxyl+euU13r94mGOp5/lMO2j54sC7iMa/NICskhCPa69H/f55iQ60rs666iDuxyVE903KxPqDIGcuztIKrj0UBSmRPxfl67BKhjnApdTQTTM7Ou0h2JmZSoh1Znf96ibjK/hH6BXUKIyno7xnpP/RA46JqHmpDaYqt/5QzpflfHo/i+xTMsW4ZZnrk/zN6i1aDFoNeR4uk6JjxlSpZBFwDEr6qUQ8Ia3fVxFqvgLhi3D3msXOY8dxwSJUEmu1de/dDD1maHdJJOsAfsDh0h8Y//kE4pGbDVOBRWpzXmZ3VmGcZZ2fIqH9bfAgMBAAE=
     * Addresses : ["/ip6/::1/tcp/4001/ipfs/Qmc6ixYBnr6t9Er4UhFjjgS5r95K2nMbf3yqNwq56R1Juc","/ip4/127.0.0.1/tcp/4001/ipfs/Qmc6ixYBnr6t9Er4UhFjjgS5r95K2nMbf3yqNwq56R1Juc","/ip4/192.168.20.123/tcp/4001/ipfs/Qmc6ixYBnr6t9Er4UhFjjgS5r95K2nMbf3yqNwq56R1Juc","/ip4/192.168.57.1/tcp/4001/ipfs/Qmc6ixYBnr6t9Er4UhFjjgS5r95K2nMbf3yqNwq56R1Juc","/ip4/180.169.128.154/tcp/4001/ipfs/Qmc6ixYBnr6t9Er4UhFjjgS5r95K2nMbf3yqNwq56R1Juc"]
     * AgentVersion : go-ipfs/0.4.14/
     * ProtocolVersion : ipfs/0.1.0
     */

    private String ID;
    private String PublicKey;
    private String AgentVersion;
    private String ProtocolVersion;
    private List<String> Addresses;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPublicKey() {
        return PublicKey;
    }

    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    public String getAgentVersion() {
        return AgentVersion;
    }

    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    public String getProtocolVersion() {
        return ProtocolVersion;
    }

    public void setProtocolVersion(String ProtocolVersion) {
        this.ProtocolVersion = ProtocolVersion;
    }

    @Override
    public String toString() {
        return "Id{" +
                "ID='" + ID + '\'' +
                ", PublicKey='" + PublicKey + '\'' +
                ", AgentVersion='" + AgentVersion + '\'' +
                ", ProtocolVersion='" + ProtocolVersion + '\'' +
                ", Addresses=" + Addresses +
                '}';
    }

    public List<String> getAddresses() {
        return Addresses;
    }

    public void setAddresses(List<String> Addresses) {
        this.Addresses = Addresses;
    }
}
