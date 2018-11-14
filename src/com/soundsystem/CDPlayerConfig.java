package com.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 定义了Spring的装配规则 ComponentScan默认扫描与配置类相同的包 查找带有Component注解的类
 *
 * @author dalongm
 * @date 2018年7月14日
 */
@Configuration
//@ComponentScan
//@Import(CDConfig.class)
public class CDPlayerConfig {

//	@Bean
//	public CDPlayer cdPlayer() {
//		return new CDPlayer(sgtPeppers());
//	}

//	@Bean(name = "lonelyHeartsClubBand")
//	public CompactDisc sgtPeppers(){
//		return new SgtPeppers();
//	}

	/**
	 * JavaConfig 声明bean
	 * @param compactDisc 在xml中声明的bean
	 * @return CDPlayer 对象
	 */
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
