package com.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 对强依赖使用构造器依赖，
 * 对可选依赖使用属性注入
 * 
 * @author dalongm
 */
@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc compactDisc;

	@Autowired
	public CDPlayer(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
//	@Autowired
//	public void setCompactDisc(CompactDisc compactDisc) {
//		this.compactDisc = compactDisc;
//	}

	@Override
	public void play() {
		compactDisc.play();
	}
}
