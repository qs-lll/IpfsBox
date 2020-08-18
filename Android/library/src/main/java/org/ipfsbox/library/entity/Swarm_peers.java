package org.ipfsbox.library.entity;

import java.util.List;

/**
 * author : qslll
 * date   : 2020/8/18
 */
class Swarm_peers {

    private List<PeersBean> Peers;

    public List<PeersBean> getPeers() {
        return Peers;
    }

    public void setPeers(List<PeersBean> Peers) {
        this.Peers = Peers;
    }

    public static class PeersBean {
        /**
         * Addr : <string>
         * Direction : <int>
         * Latency : <string>
         * Muxer : <string>
         * Peer : <string>
         * Streams : [{"Protocol":"<string>"}]
         */

        private String Addr;
        private String Direction;
        private String Latency;
        private String Muxer;
        private String Peer;
        private List<StreamsBean> Streams;

        public String getAddr() {
            return Addr;
        }

        public void setAddr(String Addr) {
            this.Addr = Addr;
        }

        public String getDirection() {
            return Direction;
        }

        public void setDirection(String Direction) {
            this.Direction = Direction;
        }

        public String getLatency() {
            return Latency;
        }

        public void setLatency(String Latency) {
            this.Latency = Latency;
        }

        public String getMuxer() {
            return Muxer;
        }

        public void setMuxer(String Muxer) {
            this.Muxer = Muxer;
        }

        public String getPeer() {
            return Peer;
        }

        public void setPeer(String Peer) {
            this.Peer = Peer;
        }

        public List<StreamsBean> getStreams() {
            return Streams;
        }

        public void setStreams(List<StreamsBean> Streams) {
            this.Streams = Streams;
        }

        public static class StreamsBean {
            /**
             * Protocol : <string>
             */

            private String Protocol;

            public String getProtocol() {
                return Protocol;
            }

            public void setProtocol(String Protocol) {
                this.Protocol = Protocol;
            }
        }
    }
}
