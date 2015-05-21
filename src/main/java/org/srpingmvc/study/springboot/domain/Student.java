package org.srpingmvc.study.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student", catalog = "manager")
public class Student extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	private String baomingdiandaima;
	private String baomingdidian;
	private String baomingdianyoubian;
	private String baominghao;
	private String xingming;
	private String xingmingpinyin;
	private String xingbie;
	private String jiguansuozaidi;
	private String hunyin;
	private String chushengriqi;
	private String yidongdianhua;
	private String dianzixinxiang;
	private String benbiyedanwei;
	private String benbiyezhuanye;
	private String minzu;
	private String minzuma;
	private String benkebinianyue;
	private String biyeshengshima;
	private String bidanweishengshi;
	private String benkebizhenghao;
	private String kaoshididian;
	private String zhengzhimianmaoma;
	private String zhengzhimianmao;
	private String zaixiaoshengxuehao;
	private String xuelima;
	private String yuanxueli;
	private String xueshizhengshuhao;
	private String xueweima;
	private String yuanxuewei;
	private String luquleibiema;
	private String luquleibie;
	private String ruxuefangshima;
	private String ruxuefangshi;
	private String kaoshifangshima;
	private String zibianzhuanyema;
	private String zhuanyedaima;
	private String zhuanyemingchen;
	private String yanjiufangxiangma;
	private String yanjiufangxiang;
	private String baokaodanweima;
	private String baokaodanwei;
	private String dierzhiyuan;
	private String dierzhiyuanma;
	private String daoshibianhao;
	private String daoshi;
	private String daoshizhicheng;
	private String xisuoma;
	private String xisuo;
	private String xueyuan;
	private String waiguoyuma;
	private String waiyu;
	private String zhengzhililunma;
	private String zhengzhi;
	private String yewuke1ma;
	private String yewuke1;
	private String yewuke2ma;
	private String yewuke2;
	private String zhuanyefangxiang;
	
	public Student() {
		super();
	}

	@Column(name="zhuanyefangxiang")
	public String getZhuanyefangxiang() {
		return zhuanyefangxiang;
	}


	public void setZhuanyefangxiang(String zhuanyefangxiang) {
		this.zhuanyefangxiang = zhuanyefangxiang;
	}


	@Override
	public String toString() {
		return "Student [baomingdiandaima=" + baomingdiandaima
				+ ", baomingdidian=" + baomingdidian + ", baomingdianyoubian="
				+ baomingdianyoubian + ", baominghao=" + baominghao
				+ ", xingming=" + xingming + ", xingmingpinyin="
				+ xingmingpinyin + ", xingbie=" + xingbie + ", jiguansuozaidi="
				+ jiguansuozaidi + ", hunyin=" + hunyin + ", chushengriqi="
				+ chushengriqi + ", yidongdianhua=" + yidongdianhua
				+ ", dianzixinxiang=" + dianzixinxiang + ", benbiyedanwei="
				+ benbiyedanwei + ", benbiyezhuanye=" + benbiyezhuanye
				+ ", minzu=" + minzu + ", minzuma=" + minzuma
				+ ", benkebinianyue=" + benkebinianyue + ", biyeshengshima="
				+ biyeshengshima + ", bidanweishengshi=" + bidanweishengshi
				+ ", benkebizhenghao=" + benkebizhenghao + ", kaoshididian="
				+ kaoshididian + ", zhengzhimianmaoma=" + zhengzhimianmaoma
				+ ", zhengzhimianmao=" + zhengzhimianmao
				+ ", zaixiaoshengxuehao=" + zaixiaoshengxuehao + ", xuelima="
				+ xuelima + ", yuanxueli=" + yuanxueli + ", xueshizhengshuhao="
				+ xueshizhengshuhao + ", xueweima=" + xueweima
				+ ", yuanxuewei=" + yuanxuewei + ", luquleibiema="
				+ luquleibiema + ", luquleibie=" + luquleibie
				+ ", ruxuefangshima=" + ruxuefangshima + ", ruxuefangshi="
				+ ruxuefangshi + ", kaoshifangshima=" + kaoshifangshima
				+ ", zibianzhuanyema=" + zibianzhuanyema + ", zhuanyedaima="
				+ zhuanyedaima + ", zhuanyemingchen=" + zhuanyemingchen
				+ ", yanjiufangxiangma=" + yanjiufangxiangma
				+ ", yanjiufangxiang=" + yanjiufangxiang + ", baokaodanweima="
				+ baokaodanweima + ", baokaodanwei=" + baokaodanwei
				+ ", dierzhiyuan=" + dierzhiyuan + ", dierzhiyuanma="
				+ dierzhiyuanma + ", daoshibianhao=" + daoshibianhao
				+ ", daoshi=" + daoshi + ", daoshizhicheng=" + daoshizhicheng
				+ ", xisuoma=" + xisuoma + ", xisuo=" + xisuo + ", xueyuan="
				+ xueyuan + ", waiguoyuma=" + waiguoyuma + ", waiyu=" + waiyu
				+ ", zhengzhililunma=" + zhengzhililunma + ", zhengzhi="
				+ zhengzhi + ", yewuke1ma=" + yewuke1ma + ", yewuke1="
				+ yewuke1 + ", yewuke2ma=" + yewuke2ma + ", yewuke2=" + yewuke2
				+ ", zhuanyefangxiang=" + zhuanyefangxiang + "]";
	}


	public Student(String baomingdiandaima, String baomingdidian,
			String baomingdianyoubian, String baominghao, String xingming,
			String xingmingpinyin, String xingbie, String jiguansuozaidi,
			String hunyin, String chushengriqi, String yidongdianhua,
			String dianzixinxiang, String benbiyedanwei, String benbiyezhuanye,
			String minzu, String minzuma, String benkebinianyue,
			String biyeshengshima, String bidanweishengshi,
			String benkebizhenghao, String kaoshididian,
			String zhengzhimianmaoma, String zhengzhimianmao,
			String zaixiaoshengxuehao, String xuelima, String yuanxueli,
			String xueshizhengshuhao, String xueweima, String yuanxuewei,
			String luquleibiema, String luquleibie, String ruxuefangshima,
			String ruxuefangshi, String kaoshifangshima,
			String zibianzhuanyema, String zhuanyedaima,
			String zhuanyemingchen, String yanjiufangxiangma,
			String yanjiufangxiang, String baokaodanweima, String baokaodanwei,
			String dierzhiyuan, String dierzhiyuanma, String daoshibianhao,
			String daoshi, String daoshizhicheng, String xisuoma, String xisuo,
			String xueyuan, String waiguoyuma, String waiyu,
			String zhengzhililunma, String zhengzhi, String yewuke1ma,
			String yewuke1, String yewuke2ma, String yewuke2,
			String zhuanyefangxiang) {
		super();
		this.baomingdiandaima = baomingdiandaima;
		this.baomingdidian = baomingdidian;
		this.baomingdianyoubian = baomingdianyoubian;
		this.baominghao = baominghao;
		this.xingming = xingming;
		this.xingmingpinyin = xingmingpinyin;
		this.xingbie = xingbie;
		this.jiguansuozaidi = jiguansuozaidi;
		this.hunyin = hunyin;
		this.chushengriqi = chushengriqi;
		this.yidongdianhua = yidongdianhua;
		this.dianzixinxiang = dianzixinxiang;
		this.benbiyedanwei = benbiyedanwei;
		this.benbiyezhuanye = benbiyezhuanye;
		this.minzu = minzu;
		this.minzuma = minzuma;
		this.benkebinianyue = benkebinianyue;
		this.biyeshengshima = biyeshengshima;
		this.bidanweishengshi = bidanweishengshi;
		this.benkebizhenghao = benkebizhenghao;
		this.kaoshididian = kaoshididian;
		this.zhengzhimianmaoma = zhengzhimianmaoma;
		this.zhengzhimianmao = zhengzhimianmao;
		this.zaixiaoshengxuehao = zaixiaoshengxuehao;
		this.xuelima = xuelima;
		this.yuanxueli = yuanxueli;
		this.xueshizhengshuhao = xueshizhengshuhao;
		this.xueweima = xueweima;
		this.yuanxuewei = yuanxuewei;
		this.luquleibiema = luquleibiema;
		this.luquleibie = luquleibie;
		this.ruxuefangshima = ruxuefangshima;
		this.ruxuefangshi = ruxuefangshi;
		this.kaoshifangshima = kaoshifangshima;
		this.zibianzhuanyema = zibianzhuanyema;
		this.zhuanyedaima = zhuanyedaima;
		this.zhuanyemingchen = zhuanyemingchen;
		this.yanjiufangxiangma = yanjiufangxiangma;
		this.yanjiufangxiang = yanjiufangxiang;
		this.baokaodanweima = baokaodanweima;
		this.baokaodanwei = baokaodanwei;
		this.dierzhiyuan = dierzhiyuan;
		this.dierzhiyuanma = dierzhiyuanma;
		this.daoshibianhao = daoshibianhao;
		this.daoshi = daoshi;
		this.daoshizhicheng = daoshizhicheng;
		this.xisuoma = xisuoma;
		this.xisuo = xisuo;
		this.xueyuan = xueyuan;
		this.waiguoyuma = waiguoyuma;
		this.waiyu = waiyu;
		this.zhengzhililunma = zhengzhililunma;
		this.zhengzhi = zhengzhi;
		this.yewuke1ma = yewuke1ma;
		this.yewuke1 = yewuke1;
		this.yewuke2ma = yewuke2ma;
		this.yewuke2 = yewuke2;
		this.zhuanyefangxiang = zhuanyefangxiang;
	}


	@Column(name = "baomingdiandaima")
	public String getBaomingdiandaima() {
		return baomingdiandaima;
	}

	public void setBaomingdiandaima(String baomingdiandaima) {
		this.baomingdiandaima = baomingdiandaima;
	}
	@Column(name = "baomingdidian")
	public String getBaomingdidian() {
		return baomingdidian;
	}

	public void setBaomingdidian(String baomingdidian) {
		this.baomingdidian = baomingdidian;
	}
	@Column(name = "baomingdianyoubian")
	public String getBaomingdianyoubian() {
		return baomingdianyoubian;
	}

	public void setBaomingdianyoubian(String baomingdianyoubian) {
		this.baomingdianyoubian = baomingdianyoubian;
	}
	@Column(name = "baominghao")
	public String getBaominghao() {
		return baominghao;
	}

	public void setBaominghao(String baominghao) {
		this.baominghao = baominghao;
	}
	@Column(name = "xingming")
	public String getXingming() {
		return xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	@Column(name = "xingmingpinyin")
	public String getXingmingpinyin() {
		return xingmingpinyin;
	}

	public void setXingmingpinyin(String xingmingpinyin) {
		this.xingmingpinyin = xingmingpinyin;
	}
	@Column(name = "xingbie")
	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	@Column(name = "jiguansuozaidi")
	public String getJiguansuozaidi() {
		return jiguansuozaidi;
	}

	public void setJiguansuozaidi(String jiguansuozaidi) {
		this.jiguansuozaidi = jiguansuozaidi;
	}
	@Column(name = "hunyin")
	public String getHunyin() {
		return hunyin;
	}

	public void setHunyin(String hunyin) {
		this.hunyin = hunyin;
	}
	@Column(name = "chushengriqi")
	public String getChushengriqi() {
		return chushengriqi;
	}

	public void setChushengriqi(String chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	@Column(name = "yidongdianhua")
	public String getYidongdianhua() {
		return yidongdianhua;
	}

	public void setYidongdianhua(String yidongdianhua) {
		this.yidongdianhua = yidongdianhua;
	}
	@Column(name = "dianzixinxiang")
	public String getDianzixinxiang() {
		return dianzixinxiang;
	}

	public void setDianzixinxiang(String dianzixinxiang) {
		this.dianzixinxiang = dianzixinxiang;
	}
	@Column(name = "benbiyedanwei")
	public String getBenbiyedanwei() {
		return benbiyedanwei;
	}

	public void setBenbiyedanwei(String benbiyedanwei) {
		this.benbiyedanwei = benbiyedanwei;
	}
	@Column(name = "benbiyezhuanye")
	public String getBenbiyezhuanye() {
		return benbiyezhuanye;
	}

	public void setBenbiyezhuanye(String benbiyezhuanye) {
		this.benbiyezhuanye = benbiyezhuanye;
	}
	@Column(name = "minzu")
	public String getMinzu() {
		return minzu;
	}

	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	@Column(name = "minzuma")
	public String getMinzuma() {
		return minzuma;
	}

	public void setMinzuma(String minzuma) {
		this.minzuma = minzuma;
	}
	@Column(name = "benkebinianyue")
	public String getBenkebinianyue() {
		return benkebinianyue;
	}

	public void setBenkebinianyue(String benkebinianyue) {
		this.benkebinianyue = benkebinianyue;
	}
	@Column(name = "biyeshengshima")
	public String getBiyeshengshima() {
		return biyeshengshima;
	}

	public void setBiyeshengshima(String biyeshengshima) {
		this.biyeshengshima = biyeshengshima;
	}
	@Column(name = "bidanweishengshi")
	public String getBidanweishengshi() {
		return bidanweishengshi;
	}

	public void setBidanweishengshi(String bidanweishengshi) {
		this.bidanweishengshi = bidanweishengshi;
	}
	@Column(name = "benkebizhenghao")
	public String getBenkebizhenghao() {
		return benkebizhenghao;
	}

	public void setBenkebizhenghao(String benkebizhenghao) {
		this.benkebizhenghao = benkebizhenghao;
	}
	@Column(name = "kaoshididian")
	public String getKaoshididian() {
		return kaoshididian;
	}

	public void setKaoshididian(String kaoshididian) {
		this.kaoshididian = kaoshididian;
	}
	@Column(name = "zhengzhimianmaoma")
	public String getZhengzhimianmaoma() {
		return zhengzhimianmaoma;
	}

	public void setZhengzhimianmaoma(String zhengzhimianmaoma) {
		this.zhengzhimianmaoma = zhengzhimianmaoma;
	}
	@Column(name = "zhengzhimianmao")
	public String getZhengzhimianmao() {
		return zhengzhimianmao;
	}

	public void setZhengzhimianmao(String zhengzhimianmao) {
		this.zhengzhimianmao = zhengzhimianmao;
	}
	@Column(name = "zaixiaoshengxuehao")
	public String getZaixiaoshengxuehao() {
		return zaixiaoshengxuehao;
	}

	public void setZaixiaoshengxuehao(String zaixiaoshengxuehao) {
		this.zaixiaoshengxuehao = zaixiaoshengxuehao;
	}
	@Column(name = "xuelima")
	public String getXuelima() {
		return xuelima;
	}

	public void setXuelima(String xuelima) {
		this.xuelima = xuelima;
	}
	@Column(name = "yuanxueli")
	public String getYuanxueli() {
		return yuanxueli;
	}

	public void setYuanxueli(String yuanxueli) {
		this.yuanxueli = yuanxueli;
	}
	@Column(name = "xueshizhengshuhao")
	public String getXueshizhengshuhao() {
		return xueshizhengshuhao;
	}

	public void setXueshizhengshuhao(String xueshizhengshuhao) {
		this.xueshizhengshuhao = xueshizhengshuhao;
	}
	@Column(name = "xueweima")
	public String getXueweima() {
		return xueweima;
	}

	public void setXueweima(String xueweima) {
		this.xueweima = xueweima;
	}
	@Column(name = "yuanxuewei")
	public String getYuanxuewei() {
		return yuanxuewei;
	}

	public void setYuanxuewei(String yuanxuewei) {
		this.yuanxuewei = yuanxuewei;
	}
	@Column(name = "luquleibiema")
	public String getLuquleibiema() {
		return luquleibiema;
	}

	public void setLuquleibiema(String luquleibiema) {
		this.luquleibiema = luquleibiema;
	}
	@Column(name = "luquleibie")
	public String getLuquleibie() {
		return luquleibie;
	}

	public void setLuquleibie(String luquleibie) {
		this.luquleibie = luquleibie;
	}
	@Column(name = "ruxuefangshima")
	public String getRuxuefangshima() {
		return ruxuefangshima;
	}

	public void setRuxuefangshima(String ruxuefangshima) {
		this.ruxuefangshima = ruxuefangshima;
	}
	@Column(name = "ruxuefangshi")
	public String getRuxuefangshi() {
		return ruxuefangshi;
	}

	public void setRuxuefangshi(String ruxuefangshi) {
		this.ruxuefangshi = ruxuefangshi;
	}
	@Column(name = "kaoshifangshima")
	public String getKaoshifangshima() {
		return kaoshifangshima;
	}

	public void setKaoshifangshima(String kaoshifangshima) {
		this.kaoshifangshima = kaoshifangshima;
	}
	@Column(name = "zibianzhuanyema")
	public String getZibianzhuanyema() {
		return zibianzhuanyema;
	}

	public void setZibianzhuanyema(String zibianzhuanyema) {
		this.zibianzhuanyema = zibianzhuanyema;
	}
	@Column(name = "zhuanyedaima")
	public String getZhuanyedaima() {
		return zhuanyedaima;
	}

	public void setZhuanyedaima(String zhuanyedaima) {
		this.zhuanyedaima = zhuanyedaima;
	}
	@Column(name = "zhuanyemingchen")
	public String getZhuanyemingchen() {
		return zhuanyemingchen;
	}

	public void setZhuanyemingchen(String zhuanyemingchen) {
		this.zhuanyemingchen = zhuanyemingchen;
	}
	@Column(name = "yanjiufangxiangma")
	public String getYanjiufangxiangma() {
		return yanjiufangxiangma;
	}

	public void setYanjiufangxiangma(String yanjiufangxiangma) {
		this.yanjiufangxiangma = yanjiufangxiangma;
	}
	@Column(name = "yanjiufangxiang")
	public String getYanjiufangxiang() {
		return yanjiufangxiang;
	}

	public void setYanjiufangxiang(String yanjiufangxiang) {
		this.yanjiufangxiang = yanjiufangxiang;
	}
	@Column(name = "baokaodanweima")
	public String getBaokaodanweima() {
		return baokaodanweima;
	}

	public void setBaokaodanweima(String baokaodanweima) {
		this.baokaodanweima = baokaodanweima;
	}
	@Column(name = "baokaodanwei")
	public String getBaokaodanwei() {
		return baokaodanwei;
	}

	public void setBaokaodanwei(String baokaodanwei) {
		this.baokaodanwei = baokaodanwei;
	}
	@Column(name = "dierzhiyuan")
	public String getDierzhiyuan() {
		return dierzhiyuan;
	}

	public void setDierzhiyuan(String dierzhiyuan) {
		this.dierzhiyuan = dierzhiyuan;
	}
	@Column(name = "dierzhiyuanma")
	public String getDierzhiyuanma() {
		return dierzhiyuanma;
	}

	public void setDierzhiyuanma(String dierzhiyuanma) {
		this.dierzhiyuanma = dierzhiyuanma;
	}
	@Column(name = "daoshibianhao")
	public String getDaoshibianhao() {
		return daoshibianhao;
	}

	public void setDaoshibianhao(String daoshibianhao) {
		this.daoshibianhao = daoshibianhao;
	}
	@Column(name = "daoshi")
	public String getDaoshi() {
		return daoshi;
	}

	public void setDaoshi(String daoshi) {
		this.daoshi = daoshi;
	}
	@Column(name = "daoshizhicheng")
	public String getDaoshizhicheng() {
		return daoshizhicheng;
	}

	public void setDaoshizhicheng(String daoshizhicheng) {
		this.daoshizhicheng = daoshizhicheng;
	}
	@Column(name = "xisuoma")
	public String getXisuoma() {
		return xisuoma;
	}

	public void setXisuoma(String xisuoma) {
		this.xisuoma = xisuoma;
	}
	@Column(name = "xisuo")
	public String getXisuo() {
		return xisuo;
	}

	public void setXisuo(String xisuo) {
		this.xisuo = xisuo;
	}
	@Column(name = "xueyuan")
	public String getXueyuan() {
		return xueyuan;
	}

	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	@Column(name = "waiguoyuma")
	public String getWaiguoyuma() {
		return waiguoyuma;
	}

	public void setWaiguoyuma(String waiguoyuma) {
		this.waiguoyuma = waiguoyuma;
	}
	@Column(name = "waiyu")
	public String getWaiyu() {
		return waiyu;
	}

	public void setWaiyu(String waiyu) {
		this.waiyu = waiyu;
	}
	@Column(name = "zhengzhililunma")
	public String getZhengzhililunma() {
		return zhengzhililunma;
	}

	public void setZhengzhililunma(String zhengzhililunma) {
		this.zhengzhililunma = zhengzhililunma;
	}
	@Column(name = "zhengzhi")
	public String getZhengzhi() {
		return zhengzhi;
	}

	public void setZhengzhi(String zhengzhi) {
		this.zhengzhi = zhengzhi;
	}
	@Column(name = "yewuke1ma")
	public String getYewuke1ma() {
		return yewuke1ma;
	}

	public void setYewuke1ma(String yewuke1ma) {
		this.yewuke1ma = yewuke1ma;
	}
	@Column(name = "yewuke1")
	public String getYewuke1() {
		return yewuke1;
	}

	public void setYewuke1(String yewuke1) {
		this.yewuke1 = yewuke1;
	}
	@Column(name = "yewuke2ma")
	public String getYewuke2ma() {
		return yewuke2ma;
	}

	public void setYewuke2ma(String yewuke2ma) {
		this.yewuke2ma = yewuke2ma;
	}
	@Column(name = "yewuke2")
	public String getYewuke2() {
		return yewuke2;
	}

	public void setYewuke2(String yewuke2) {
		this.yewuke2 = yewuke2;
	}
}
