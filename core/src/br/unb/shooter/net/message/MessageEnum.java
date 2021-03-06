package br.unb.shooter.net.message;

public enum MessageEnum {
    CLIENT_INPUT("client_input", "Client Input"), //
    CLIENT_CONNECT("client_connect", "Client Connect"), //
    CLIENT_DISCOVER_HOST("client_discover_host", "Client Discover Host"), //
    SERVER_UPDATE_LOBBY("server_update_lobby", "Server Update Lobby"), //
    SERVER_NAME("server_name", "Server Name"), //
    SERVER_START("server_start", "Server Start"), //
    SERVER_UPDATE("server_update", "Server Update"); //

    private String id;

    private String name;

    private MessageEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
