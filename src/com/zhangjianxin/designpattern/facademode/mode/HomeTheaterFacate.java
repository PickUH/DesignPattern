package com.zhangjianxin.designpattern.facademode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:24
 * @Version V1.0
 **/
public class HomeTheaterFacate {

    private TheaterLight theaterLight;
    private Popcom popcom;
    private Stereo stereo;
    private Screen screen;
    private Projector projector;
    private DVDPlayer dvdPlayer;

    /**
     * 构造器初始化参数
     */
    public HomeTheaterFacate() {
        super();
        this.theaterLight = TheaterLight.getInstance();
        this.popcom = Popcom.getInstance();
        this.stereo = Stereo.getInstance();
        this.screen = Screen.getInstance();
        this.projector = Projector.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready(){
        popcom.on();
        popcom.pop();
        screen.down();
        projector.on();;
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void player(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcom.off();
        theaterLight.on();
        screen.up();
        projector.off();;
        stereo.off();
        dvdPlayer.off();
    }

}
