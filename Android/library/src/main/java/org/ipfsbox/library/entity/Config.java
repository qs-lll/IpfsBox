package org.ipfsbox.library.entity;

import java.util.List;

public class Config {
    public static class show {

        /**
         * API : {"HTTPHeaders":{"Access-Control-Allow-Methods":["PUT","GET","POST","OPTIONS"],"Access-Control-Allow-Origin":["*"]}}
         * Addresses : {"API":"/ip4/0.0.0.0/tcp/5001","Announce":[],"Gateway":"/ip4/127.0.0.1/tcp/8080","NoAnnounce":[],"Swarm":["/ip4/0.0.0.0/tcp/4001","/ip6/::/tcp/4001"]}
         * Bootstrap : ["/dnsaddr/bootstrap.libp2p.io/ipfs/QmNnooDu7bfjPFoTZYxMNLWUQJyrVwtbZg5gBMjTezGAJN","/dnsaddr/bootstrap.libp2p.io/ipfs/QmQCU2EcMqAqQPR2i9bChDtGNJchTbq5TbXJJ16u19uLTa","/dnsaddr/bootstrap.libp2p.io/ipfs/QmbLHAnMoJPWSCR5Zhtx6BHJX9KiKNN6tpvbUcqanj75Nb","/dnsaddr/bootstrap.libp2p.io/ipfs/QmcZf59bWwK5XFi76CZX8cbJ4BhTzzA3gU1ZjYZcYW3dwt","/ip4/104.131.131.82/tcp/4001/ipfs/QmaCpDMGvV2BGHeYERUEnRQAwe3N8SzbUtfsmvsqQLuvuJ","/ip4/104.236.179.241/tcp/4001/ipfs/QmSoLPppuBtQSGwKDZT2M73ULpjvfd3aZ6ha4oFGL1KrGM","/ip4/128.199.219.111/tcp/4001/ipfs/QmSoLSafTMBsPKadTEgaXctDQVcqN88CNLHXMkTNwMKPnu","/ip4/104.236.76.40/tcp/4001/ipfs/QmSoLV4Bbm51jM9C4gDYZQ9Cy3U6aXMJDAbzgu2fzaDs64","/ip4/178.62.158.247/tcp/4001/ipfs/QmSoLer265NRgSp2LA3dPaeykiS1J6DifTC88f5uVQKNAd","/ip6/2604:a880:1:20::203:d001/tcp/4001/ipfs/QmSoLPppuBtQSGwKDZT2M73ULpjvfd3aZ6ha4oFGL1KrGM","/ip6/2400:6180:0:d0::151:6001/tcp/4001/ipfs/QmSoLSafTMBsPKadTEgaXctDQVcqN88CNLHXMkTNwMKPnu","/ip6/2604:a880:800:10::4a:5001/tcp/4001/ipfs/QmSoLV4Bbm51jM9C4gDYZQ9Cy3U6aXMJDAbzgu2fzaDs64","/ip6/2a03:b0c0:0:1010::23:1001/tcp/4001/ipfs/QmSoLer265NRgSp2LA3dPaeykiS1J6DifTC88f5uVQKNAd"]
         * Datastore : {"BloomFilterSize":0,"GCPeriod":"1h","HashOnRead":false,"Spec":{"mounts":[{"child":{"path":"blocks","shardFunc":"/repo/flatfs/shard/v1/next-to-last/2","sync":true,"type":"flatfs"},"mountpoint":"/blocks","prefix":"flatfs.datastore","type":"measure"},{"child":{"compression":"none","path":"datastore","type":"levelds"},"mountpoint":"/","prefix":"leveldb.datastore","type":"measure"}],"type":"mount"},"StorageGCWatermark":90,"StorageMax":"10GB"}
         * Discovery : {"MDNS":{"Enabled":true,"Interval":10}}
         * Experimental : {"FilestoreEnabled":false,"Libp2pStreamMounting":false,"ShardingEnabled":false}
         * Gateway : {"HTTPHeaders":{"Access-Control-Allow-Headers":["X-Requested-With","Range"],"Access-Control-Allow-Methods":["GET"],"Access-Control-Allow-Origin":["*"]},"PathPrefixes":[],"RootRedirect":"","Writable":false}
         * Identity : {"PeerID":"Qmc6ixYBnr6t9Er4UhFjjgS5r95K2nMbf3yqNwq56R1Juc"}
         * Ipns : {"RecordLifetime":"","RepublishPeriod":"","ResolveCacheSize":128}
         * Mounts : {"FuseAllowOther":false,"IPFS":"/ipfs","IPNS":"/ipns"}
         * Reprovider : {"Interval":"12h","Strategy":"all"}
         * Swarm : {"AddrFilters":null,"ConnMgr":{"GracePeriod":"20s","HighWater":900,"LowWater":600,"Type":"basic"},"DisableBandwidthMetrics":false,"DisableNatPortMap":false,"DisableRelay":false,"EnableRelayHop":false}
         */

        private APIBean API;
        private AddressesBean Addresses;
        private DatastoreBean Datastore;
        private DiscoveryBean Discovery;
        private ExperimentalBean Experimental;
        private GatewayBean Gateway;
        private IdentityBean Identity;
        private IpnsBean Ipns;
        private MountsBeanX Mounts;
        private ReproviderBean Reprovider;
        private SwarmBean Swarm;
        private List<String> Bootstrap;

        public APIBean getAPI() {
            return API;
        }

        public void setAPI(APIBean API) {
            this.API = API;
        }

        public AddressesBean getAddresses() {
            return Addresses;
        }

        public void setAddresses(AddressesBean Addresses) {
            this.Addresses = Addresses;
        }

        public DatastoreBean getDatastore() {
            return Datastore;
        }

        public void setDatastore(DatastoreBean Datastore) {
            this.Datastore = Datastore;
        }

        public DiscoveryBean getDiscovery() {
            return Discovery;
        }

        public void setDiscovery(DiscoveryBean Discovery) {
            this.Discovery = Discovery;
        }

        public ExperimentalBean getExperimental() {
            return Experimental;
        }

        public void setExperimental(ExperimentalBean Experimental) {
            this.Experimental = Experimental;
        }

        public GatewayBean getGateway() {
            return Gateway;
        }

        public void setGateway(GatewayBean Gateway) {
            this.Gateway = Gateway;
        }

        public IdentityBean getIdentity() {
            return Identity;
        }

        public void setIdentity(IdentityBean Identity) {
            this.Identity = Identity;
        }

        public IpnsBean getIpns() {
            return Ipns;
        }

        public void setIpns(IpnsBean Ipns) {
            this.Ipns = Ipns;
        }

        public MountsBeanX getMounts() {
            return Mounts;
        }

        public void setMounts(MountsBeanX Mounts) {
            this.Mounts = Mounts;
        }

        public ReproviderBean getReprovider() {
            return Reprovider;
        }

        public void setReprovider(ReproviderBean Reprovider) {
            this.Reprovider = Reprovider;
        }

        public SwarmBean getSwarm() {
            return Swarm;
        }

        public void setSwarm(SwarmBean Swarm) {
            this.Swarm = Swarm;
        }

        public List<String> getBootstrap() {
            return Bootstrap;
        }

        public void setBootstrap(List<String> Bootstrap) {
            this.Bootstrap = Bootstrap;
        }

        public static class APIBean {
            /**
             * HTTPHeaders : {"Access-Control-Allow-Methods":["PUT","GET","POST","OPTIONS"],"Access-Control-Allow-Origin":["*"]}
             */

            private HTTPHeadersBean HTTPHeaders;

            public HTTPHeadersBean getHTTPHeaders() {
                return HTTPHeaders;
            }

            public void setHTTPHeaders(HTTPHeadersBean HTTPHeaders) {
                this.HTTPHeaders = HTTPHeaders;
            }

            public static class HTTPHeadersBean {
                private List<String> AccessControlAllowMethods;
                private List<String> AccessControlAllowOrigin;

                public List<String> getAccessControlAllowMethods() {
                    return AccessControlAllowMethods;
                }

                public void setAccessControlAllowMethods(List<String> AccessControlAllowMethods) {
                    this.AccessControlAllowMethods = AccessControlAllowMethods;
                }

                public List<String> getAccessControlAllowOrigin() {
                    return AccessControlAllowOrigin;
                }

                public void setAccessControlAllowOrigin(List<String> AccessControlAllowOrigin) {
                    this.AccessControlAllowOrigin = AccessControlAllowOrigin;
                }
            }
        }

        public static class AddressesBean {
            /**
             * API : /ip4/0.0.0.0/tcp/5001
             * Announce : []
             * Gateway : /ip4/127.0.0.1/tcp/8080
             * NoAnnounce : []
             * Swarm : ["/ip4/0.0.0.0/tcp/4001","/ip6/::/tcp/4001"]
             */

            private String API;
            private String Gateway;
            private List<?> Announce;
            private List<?> NoAnnounce;
            private List<String> Swarm;

            public String getAPI() {
                return API;
            }

            public void setAPI(String API) {
                this.API = API;
            }

            public String getGateway() {
                return Gateway;
            }

            public void setGateway(String Gateway) {
                this.Gateway = Gateway;
            }

            public List<?> getAnnounce() {
                return Announce;
            }

            public void setAnnounce(List<?> Announce) {
                this.Announce = Announce;
            }

            public List<?> getNoAnnounce() {
                return NoAnnounce;
            }

            public void setNoAnnounce(List<?> NoAnnounce) {
                this.NoAnnounce = NoAnnounce;
            }

            public List<String> getSwarm() {
                return Swarm;
            }

            public void setSwarm(List<String> Swarm) {
                this.Swarm = Swarm;
            }
        }

        public static class DatastoreBean {
            /**
             * BloomFilterSize : 0
             * GCPeriod : 1h
             * HashOnRead : false
             * Spec : {"mounts":[{"child":{"path":"blocks","shardFunc":"/repo/flatfs/shard/v1/next-to-last/2","sync":true,"type":"flatfs"},"mountpoint":"/blocks","prefix":"flatfs.datastore","type":"measure"},{"child":{"compression":"none","path":"datastore","type":"levelds"},"mountpoint":"/","prefix":"leveldb.datastore","type":"measure"}],"type":"mount"}
             * StorageGCWatermark : 90
             * StorageMax : 10GB
             */

            private int BloomFilterSize;
            private String GCPeriod;
            private boolean HashOnRead;
            private SpecBean Spec;
            private int StorageGCWatermark;
            private String StorageMax;

            public int getBloomFilterSize() {
                return BloomFilterSize;
            }

            public void setBloomFilterSize(int BloomFilterSize) {
                this.BloomFilterSize = BloomFilterSize;
            }

            public String getGCPeriod() {
                return GCPeriod;
            }

            public void setGCPeriod(String GCPeriod) {
                this.GCPeriod = GCPeriod;
            }

            public boolean isHashOnRead() {
                return HashOnRead;
            }

            public void setHashOnRead(boolean HashOnRead) {
                this.HashOnRead = HashOnRead;
            }

            public SpecBean getSpec() {
                return Spec;
            }

            public void setSpec(SpecBean Spec) {
                this.Spec = Spec;
            }

            public int getStorageGCWatermark() {
                return StorageGCWatermark;
            }

            public void setStorageGCWatermark(int StorageGCWatermark) {
                this.StorageGCWatermark = StorageGCWatermark;
            }

            public String getStorageMax() {
                return StorageMax;
            }

            public void setStorageMax(String StorageMax) {
                this.StorageMax = StorageMax;
            }

            public static class SpecBean {
                /**
                 * mounts : [{"child":{"path":"blocks","shardFunc":"/repo/flatfs/shard/v1/next-to-last/2","sync":true,"type":"flatfs"},"mountpoint":"/blocks","prefix":"flatfs.datastore","type":"measure"},{"child":{"compression":"none","path":"datastore","type":"levelds"},"mountpoint":"/","prefix":"leveldb.datastore","type":"measure"}]
                 * type : mount
                 */

                private String type;
                private List<MountsBean> mounts;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public List<MountsBean> getMounts() {
                    return mounts;
                }

                public void setMounts(List<MountsBean> mounts) {
                    this.mounts = mounts;
                }

                public static class MountsBean {
                    /**
                     * child : {"path":"blocks","shardFunc":"/repo/flatfs/shard/v1/next-to-last/2","sync":true,"type":"flatfs"}
                     * mountpoint : /blocks
                     * prefix : flatfs.datastore
                     * type : measure
                     */

                    private ChildBean child;
                    private String mountpoint;
                    private String prefix;
                    private String type;

                    public ChildBean getChild() {
                        return child;
                    }

                    public void setChild(ChildBean child) {
                        this.child = child;
                    }

                    public String getMountpoint() {
                        return mountpoint;
                    }

                    public void setMountpoint(String mountpoint) {
                        this.mountpoint = mountpoint;
                    }

                    public String getPrefix() {
                        return prefix;
                    }

                    public void setPrefix(String prefix) {
                        this.prefix = prefix;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public static class ChildBean {
                        /**
                         * path : blocks
                         * shardFunc : /repo/flatfs/shard/v1/next-to-last/2
                         * sync : true
                         * type : flatfs
                         */

                        private String path;
                        private String shardFunc;
                        private boolean sync;
                        private String type;

                        public String getPath() {
                            return path;
                        }

                        public void setPath(String path) {
                            this.path = path;
                        }

                        public String getShardFunc() {
                            return shardFunc;
                        }

                        public void setShardFunc(String shardFunc) {
                            this.shardFunc = shardFunc;
                        }

                        public boolean isSync() {
                            return sync;
                        }

                        public void setSync(boolean sync) {
                            this.sync = sync;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }
                }
            }
        }

        public static class DiscoveryBean {
            /**
             * MDNS : {"Enabled":true,"Interval":10}
             */

            private MDNSBean MDNS;

            public MDNSBean getMDNS() {
                return MDNS;
            }

            public void setMDNS(MDNSBean MDNS) {
                this.MDNS = MDNS;
            }

            public static class MDNSBean {
                /**
                 * Enabled : true
                 * Interval : 10
                 */

                private boolean Enabled;
                private int Interval;

                public boolean isEnabled() {
                    return Enabled;
                }

                public void setEnabled(boolean Enabled) {
                    this.Enabled = Enabled;
                }

                public int getInterval() {
                    return Interval;
                }

                public void setInterval(int Interval) {
                    this.Interval = Interval;
                }
            }
        }

        public static class ExperimentalBean {
            /**
             * FilestoreEnabled : false
             * Libp2pStreamMounting : false
             * ShardingEnabled : false
             */

            private boolean FilestoreEnabled;
            private boolean Libp2pStreamMounting;
            private boolean ShardingEnabled;

            public boolean isFilestoreEnabled() {
                return FilestoreEnabled;
            }

            public void setFilestoreEnabled(boolean FilestoreEnabled) {
                this.FilestoreEnabled = FilestoreEnabled;
            }

            public boolean isLibp2pStreamMounting() {
                return Libp2pStreamMounting;
            }

            public void setLibp2pStreamMounting(boolean Libp2pStreamMounting) {
                this.Libp2pStreamMounting = Libp2pStreamMounting;
            }

            public boolean isShardingEnabled() {
                return ShardingEnabled;
            }

            public void setShardingEnabled(boolean ShardingEnabled) {
                this.ShardingEnabled = ShardingEnabled;
            }
        }

        public static class GatewayBean {
            /**
             * HTTPHeaders : {"Access-Control-Allow-Headers":["X-Requested-With","Range"],"Access-Control-Allow-Methods":["GET"],"Access-Control-Allow-Origin":["*"]}
             * PathPrefixes : []
             * RootRedirect :
             * Writable : false
             */

            private HTTPHeadersBeanX HTTPHeaders;
            private String RootRedirect;
            private boolean Writable;
            private List<?> PathPrefixes;

            public HTTPHeadersBeanX getHTTPHeaders() {
                return HTTPHeaders;
            }

            public void setHTTPHeaders(HTTPHeadersBeanX HTTPHeaders) {
                this.HTTPHeaders = HTTPHeaders;
            }

            public String getRootRedirect() {
                return RootRedirect;
            }

            public void setRootRedirect(String RootRedirect) {
                this.RootRedirect = RootRedirect;
            }

            public boolean isWritable() {
                return Writable;
            }

            public void setWritable(boolean Writable) {
                this.Writable = Writable;
            }

            public List<?> getPathPrefixes() {
                return PathPrefixes;
            }

            public void setPathPrefixes(List<?> PathPrefixes) {
                this.PathPrefixes = PathPrefixes;
            }

            public static class HTTPHeadersBeanX {
                private List<String> AccessControlAllowHeaders;
                private List<String> AccessControlAllowMethods;
                private List<String> AccessControlAllowOrigin;

                public List<String> getAccessControlAllowHeaders() {
                    return AccessControlAllowHeaders;
                }

                public void setAccessControlAllowHeaders(List<String> AccessControlAllowHeaders) {
                    this.AccessControlAllowHeaders = AccessControlAllowHeaders;
                }

                public List<String> getAccessControlAllowMethods() {
                    return AccessControlAllowMethods;
                }

                public void setAccessControlAllowMethods(List<String> AccessControlAllowMethods) {
                    this.AccessControlAllowMethods = AccessControlAllowMethods;
                }

                public List<String> getAccessControlAllowOrigin() {
                    return AccessControlAllowOrigin;
                }

                public void setAccessControlAllowOrigin(List<String> AccessControlAllowOrigin) {
                    this.AccessControlAllowOrigin = AccessControlAllowOrigin;
                }
            }
        }

        public static class IdentityBean {
            /**
             * PeerID : Qmc6ixYBnr6t9Er4UhFjjgS5r95K2nMbf3yqNwq56R1Juc
             */

            private String PeerID;

            public String getPeerID() {
                return PeerID;
            }

            public void setPeerID(String PeerID) {
                this.PeerID = PeerID;
            }
        }

        public static class IpnsBean {
            /**
             * RecordLifetime :
             * RepublishPeriod :
             * ResolveCacheSize : 128
             */

            private String RecordLifetime;
            private String RepublishPeriod;
            private int ResolveCacheSize;

            public String getRecordLifetime() {
                return RecordLifetime;
            }

            public void setRecordLifetime(String RecordLifetime) {
                this.RecordLifetime = RecordLifetime;
            }

            public String getRepublishPeriod() {
                return RepublishPeriod;
            }

            public void setRepublishPeriod(String RepublishPeriod) {
                this.RepublishPeriod = RepublishPeriod;
            }

            public int getResolveCacheSize() {
                return ResolveCacheSize;
            }

            public void setResolveCacheSize(int ResolveCacheSize) {
                this.ResolveCacheSize = ResolveCacheSize;
            }
        }

        public static class MountsBeanX {
            /**
             * FuseAllowOther : false
             * IPFS : /ipfs
             * IPNS : /ipns
             */

            private boolean FuseAllowOther;
            private String IPFS;
            private String IPNS;

            public boolean isFuseAllowOther() {
                return FuseAllowOther;
            }

            public void setFuseAllowOther(boolean FuseAllowOther) {
                this.FuseAllowOther = FuseAllowOther;
            }

            public String getIPFS() {
                return IPFS;
            }

            public void setIPFS(String IPFS) {
                this.IPFS = IPFS;
            }

            public String getIPNS() {
                return IPNS;
            }

            public void setIPNS(String IPNS) {
                this.IPNS = IPNS;
            }
        }

        public static class ReproviderBean {
            /**
             * Interval : 12h
             * Strategy : all
             */

            private String Interval;
            private String Strategy;

            public String getInterval() {
                return Interval;
            }

            public void setInterval(String Interval) {
                this.Interval = Interval;
            }

            public String getStrategy() {
                return Strategy;
            }

            public void setStrategy(String Strategy) {
                this.Strategy = Strategy;
            }
        }

        public static class SwarmBean {
            /**
             * AddrFilters : null
             * ConnMgr : {"GracePeriod":"20s","HighWater":900,"LowWater":600,"Type":"basic"}
             * DisableBandwidthMetrics : false
             * DisableNatPortMap : false
             * DisableRelay : false
             * EnableRelayHop : false
             */

            private Object AddrFilters;
            private ConnMgrBean ConnMgr;
            private boolean DisableBandwidthMetrics;
            private boolean DisableNatPortMap;
            private boolean DisableRelay;
            private boolean EnableRelayHop;

            public Object getAddrFilters() {
                return AddrFilters;
            }

            public void setAddrFilters(Object AddrFilters) {
                this.AddrFilters = AddrFilters;
            }

            public ConnMgrBean getConnMgr() {
                return ConnMgr;
            }

            public void setConnMgr(ConnMgrBean ConnMgr) {
                this.ConnMgr = ConnMgr;
            }

            public boolean isDisableBandwidthMetrics() {
                return DisableBandwidthMetrics;
            }

            public void setDisableBandwidthMetrics(boolean DisableBandwidthMetrics) {
                this.DisableBandwidthMetrics = DisableBandwidthMetrics;
            }

            public boolean isDisableNatPortMap() {
                return DisableNatPortMap;
            }

            public void setDisableNatPortMap(boolean DisableNatPortMap) {
                this.DisableNatPortMap = DisableNatPortMap;
            }

            public boolean isDisableRelay() {
                return DisableRelay;
            }

            public void setDisableRelay(boolean DisableRelay) {
                this.DisableRelay = DisableRelay;
            }

            public boolean isEnableRelayHop() {
                return EnableRelayHop;
            }

            public void setEnableRelayHop(boolean EnableRelayHop) {
                this.EnableRelayHop = EnableRelayHop;
            }

            public static class ConnMgrBean {
                /**
                 * GracePeriod : 20s
                 * HighWater : 900
                 * LowWater : 600
                 * Type : basic
                 */

                private String GracePeriod;
                private int HighWater;
                private int LowWater;
                private String Type;

                public String getGracePeriod() {
                    return GracePeriod;
                }

                public void setGracePeriod(String GracePeriod) {
                    this.GracePeriod = GracePeriod;
                }

                public int getHighWater() {
                    return HighWater;
                }

                public void setHighWater(int HighWater) {
                    this.HighWater = HighWater;
                }

                public int getLowWater() {
                    return LowWater;
                }

                public void setLowWater(int LowWater) {
                    this.LowWater = LowWater;
                }

                public String getType() {
                    return Type;
                }

                public void setType(String Type) {
                    this.Type = Type;
                }
            }
        }
    }
}
