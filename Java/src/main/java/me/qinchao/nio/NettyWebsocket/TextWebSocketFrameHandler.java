package me.qinchao.nio.NettyWebsocket;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * Created by SULVTO on 16-4-11.
 */
public class TextWebSocketFrameHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        Channel channel = ctx.channel();
        for (Channel group : channelGroup) {
            if (group != channel) {
                group.writeAndFlush(new TextWebSocketFrame("[" + channel.remoteAddress() + "]" + msg.text()));
            } else {
                // TODO
            }
        }
    }

    @Override
    public void handlerAdded(ChannelHandlerContext context) {
        Channel channel = context.channel();
        channelGroup.add(channel);
        System.out.println("Client:" + channel.remoteAddress() + " Added");
    }

    @Override
    public void channelActive(ChannelHandlerContext context) {
        Channel channel = context.channel();
        System.out.println("Client:" + channel.remoteAddress() + " Active");
    }

    @Override
    public void channelInactive(ChannelHandlerContext context) throws Exception {
        Channel channel = context.channel();
        System.out.println("Client:" + channel.remoteAddress() + " Inactive");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext context, Throwable cause) {
        Channel channel = context.channel();
        cause.printStackTrace();
        channel.close();
    }

}
