package com.takiku.im_lib.entity.base;

/**
 * author:chengwl
 * Description:
 * Date:2020/4/10
 */
public abstract class AbstractPack<T extends AbstractBody> {



    public AbstractPack(int packType){
        this.packType=packType;
    }

    private int packType;
    private T abstractMessage;

    public int getPackType() {
        return packType;
    }


    public T getAbstractMessage() {
        return abstractMessage;
    }

    public void setAbstractMessage(T abstractMessage) {
        this.abstractMessage = abstractMessage;
    }
}
