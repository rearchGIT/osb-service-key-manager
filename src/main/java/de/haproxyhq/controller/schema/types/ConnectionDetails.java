/**
 * 
 */
package de.haproxyhq.controller.schema.types;

/**
 * @author Johannes Hiemer.
 *
 */
public class ConnectionDetails {

	private String ip;
	
	private int port;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
}
