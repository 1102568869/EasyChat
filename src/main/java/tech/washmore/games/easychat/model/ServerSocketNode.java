package tech.washmore.games.easychat.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Washmore
 * @version V1.0
 * @summary TODO
 * @Copyright (c) 2017, Lianjia Group All Rights Reserved.
 * @since 2017/7/12
 */

@Data
public class ServerSocketNode implements Serializable {
    private static final long serialVersionUID = 1248553124606510585L;
    private int id;
    private String ipv4Address;
    private int port;
    private int state;
    private Date ctime;

}
