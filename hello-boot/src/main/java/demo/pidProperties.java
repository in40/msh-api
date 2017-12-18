package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("pid")

public class pidProperties {

	private int cp;
	private int ci;
	private int cd;
	private int sv;
	private int pmax;

	private int hw;

	public int gethw() {
		return hw;
	}
	public int getcp() {
		return cp;
	}

	public int getci() {
		return ci;
	}
	
	public int getcd() {
		return cd;
	}
	
	public int getsv() {
		return sv;
	}
	
	public void sethw(int hw) {
		this.hw = hw;
	}
	
	public void setcp(int cp) {
		this.cp = cp;
	}
	public void setci(int ci) {
		this.ci = ci;
	}
	public void setcd(int cd) {
		this.cd = cd;
	}
	public void setsv(int sv) {
		this.sv = sv;
	}
	
	public int getpmax() {
		return pmax;
	}
	
	public void setpmax(int pmax) {
		this.pmax = pmax;
	}
}