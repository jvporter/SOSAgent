package edu.clemson.openflow.sos.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * @author Khayam Anjam kanjam@g.clemson.edu
 * This class defines a model to parse the incoming JSON from the controller.
 * Jackson is being used to se/deserialize the data
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestParser {
    private boolean isClientAgent;
    private String transferID;
    private String clientIP;
    private int clientPort;
    private String serverAgentIP;
    private int numParallelSockets;
    private int bufferSize;
    private int queueCapacity;
    private String serverIP;
    private String serverPort;

    public RequestParser(@JsonProperty("is-client-agent") boolean isClientAgent,
                         @JsonProperty("transfer-id") String transferID,
                         @JsonProperty("client-ip") String clientIP,
                         @JsonProperty("client-port") int clientPort,
                         @JsonProperty("server-agent-ip") String serverAgentIP,
                         @JsonProperty("num-parallel-socks") int numParallelSockets,
                         @JsonProperty("buffer-size") int bufferSize,
                         @JsonProperty("queue-capacity") int queueCapacity,
                         @JsonProperty("server-ip") String serverIP,
                         @JsonProperty("server-port") String serverPort) {
        this.isClientAgent = isClientAgent;
        this.transferID = transferID;
        this.clientIP = clientIP;
        this.clientPort = clientPort;
        this.serverAgentIP = serverAgentIP;
        this.numParallelSockets = numParallelSockets;
        this.bufferSize = bufferSize;
        this.queueCapacity = queueCapacity;
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }


    public String getTransferID() {
        return transferID;
    }

    public String getClientIP() {
        return clientIP;
    }

    public int getClientPort() {
        return clientPort;
    }

    public String getServerAgentIP() {
        return serverAgentIP;
    }

    public int getNumParallelSockets() {
        return numParallelSockets;
    }

    public int getBufferSize() {
        return bufferSize;
    }

    public int getQueueCapacity() {
        return queueCapacity;
    }

    public boolean isClientAgent() {
        return isClientAgent;
    }

    public String getServerIP() {
        return serverIP;
    }

    public String getServerPort() {
        return serverPort;
    }
}
