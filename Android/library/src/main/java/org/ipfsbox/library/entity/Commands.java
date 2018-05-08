package org.ipfsbox.library.entity;

import java.util.List;

public class Commands {

    /**
     * Name : ipfs
     * Subcommands : [{"Name":"add","Subcommands":[],"Options":[{"Names":["recursive","r"]},{"Names":["quiet","q"]},{"Names":["quieter","Q"]},{"Names":["silent"]},{"Names":["progress","p"]},{"Names":["trickle","t"]},{"Names":["only-hash","n"]},{"Names":["wrap-with-directory","w"]},{"Names":["hidden","H"]},{"Names":["chunker","s"]},{"Names":["pin"]},{"Names":["raw-leaves"]},{"Names":["nocopy"]},{"Names":["fscache"]},{"Names":["cid-version"]},{"Names":["hash"]}]},{"Name":"bootstrap","Subcommands":[{"Name":"list","Subcommands":[],"Options":[]},{"Name":"add","Subcommands":[{"Name":"default","Subcommands":[],"Options":[]}],"Options":[{"Names":["default"]}]},{"Name":"rm","Subcommands":[{"Name":"all","Subcommands":[],"Options":[]}],"Options":[{"Names":["all"]}]}],"Options":[]},{"Name":"mount","Subcommands":[],"Options":[{"Names":["ipfs-path","f"]},{"Names":["ipns-path","n"]}]},{"Name":"p2p","Subcommands":[{"Name":"listener","Subcommands":[{"Name":"open","Subcommands":[],"Options":[]},{"Name":"close","Subcommands":[],"Options":[{"Names":["all","a"]}]},{"Name":"ls","Subcommands":[],"Options":[{"Names":["headers","v"]}]}],"Options":[]},{"Name":"stream","Subcommands":[{"Name":"ls","Subcommands":[],"Options":[{"Names":["headers","v"]}]},{"Name":"dial","Subcommands":[],"Options":[]},{"Name":"close","Subcommands":[],"Options":[{"Names":["all","a"]}]}],"Options":[]}],"Options":[]},{"Name":"bitswap","Subcommands":[{"Name":"wantlist","Subcommands":[],"Options":[{"Names":["peer","p"]}]},{"Name":"unwant","Subcommands":[],"Options":[]},{"Name":"ledger","Subcommands":[],"Options":[]},{"Name":"reprovide","Subcommands":[],"Options":[]},{"Name":"stat","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"diag","Subcommands":[{"Name":"sys","Subcommands":[],"Options":[]},{"Name":"cmds","Subcommands":[{"Name":"clear","Subcommands":[],"Options":[]},{"Name":"set-time","Subcommands":[],"Options":[]}],"Options":[{"Names":["verbose","v"]}]}],"Options":[]},{"Name":"shutdown","Subcommands":[],"Options":[]},{"Name":"get","Subcommands":[],"Options":[{"Names":["output","o"]},{"Names":["archive","a"]},{"Names":["compress","C"]},{"Names":["compression-level","l"]}]},{"Name":"stats","Subcommands":[{"Name":"bitswap","Subcommands":[],"Options":[]},{"Name":"bw","Subcommands":[],"Options":[{"Names":["peer","p"]},{"Names":["proto","t"]},{"Names":["poll"]},{"Names":["interval","i"]}]},{"Name":"repo","Subcommands":[],"Options":[{"Names":["human"]}]}],"Options":[]},{"Name":"config","Subcommands":[{"Name":"edit","Subcommands":[],"Options":[]},{"Name":"replace","Subcommands":[],"Options":[]},{"Name":"profile","Subcommands":[{"Name":"apply","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"show","Subcommands":[],"Options":[]}],"Options":[{"Names":["bool"]},{"Names":["json"]}]},{"Name":"dag","Subcommands":[{"Name":"put","Subcommands":[],"Options":[{"Names":["format","f"]},{"Names":["input-enc"]},{"Names":["pin"]},{"Names":["hash"]}]},{"Name":"get","Subcommands":[],"Options":[]},{"Name":"resolve","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"ping","Subcommands":[],"Options":[{"Names":["count","n"]}]},{"Name":"tar","Subcommands":[{"Name":"add","Subcommands":[],"Options":[]},{"Name":"cat","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"block","Subcommands":[{"Name":"stat","Subcommands":[],"Options":[]},{"Name":"get","Subcommands":[],"Options":[]},{"Name":"put","Subcommands":[],"Options":[{"Names":["format","f"]},{"Names":["mhtype"]},{"Names":["mhlen"]}]},{"Name":"rm","Subcommands":[],"Options":[{"Names":["force","f"]},{"Names":["quiet","q"]}]}],"Options":[]},{"Name":"files","Subcommands":[{"Name":"write","Subcommands":[],"Options":[{"Names":["offset","o"]},{"Names":["create","e"]},{"Names":["truncate","t"]},{"Names":["count","n"]},{"Names":["raw-leaves"]},{"Names":["cid-version","cid-ver"]},{"Names":["hash"]}]},{"Name":"cp","Subcommands":[],"Options":[]},{"Name":"ls","Subcommands":[],"Options":[{"Names":["l"]}]},{"Name":"stat","Subcommands":[],"Options":[{"Names":["format"]},{"Names":["hash"]},{"Names":["size"]},{"Names":["with-local"]}]},{"Name":"rm","Subcommands":[],"Options":[{"Names":["recursive","r"]}]},{"Name":"flush","Subcommands":[],"Options":[]},{"Name":"read","Subcommands":[],"Options":[{"Names":["offset","o"]},{"Names":["count","n"]}]},{"Name":"mv","Subcommands":[],"Options":[]},{"Name":"mkdir","Subcommands":[],"Options":[{"Names":["parents","p"]},{"Names":["cid-version","cid-ver"]},{"Names":["hash"]}]},{"Name":"chcid","Subcommands":[],"Options":[{"Names":["cid-version","cid-ver"]},{"Names":["hash"]}]}],"Options":[{"Names":["f","flush"]}]},{"Name":"filestore","Subcommands":[{"Name":"ls","Subcommands":[],"Options":[{"Names":["file-order"]}]},{"Name":"verify","Subcommands":[],"Options":[{"Names":["file-order"]}]},{"Name":"dups","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"pubsub","Subcommands":[{"Name":"pub","Subcommands":[],"Options":[]},{"Name":"sub","Subcommands":[],"Options":[{"Names":["discover"]}]},{"Name":"ls","Subcommands":[],"Options":[]},{"Name":"peers","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"dns","Subcommands":[],"Options":[{"Names":["recursive","r"]}]},{"Name":"id","Subcommands":[],"Options":[{"Names":["format","f"]}]},{"Name":"cat","Subcommands":[],"Options":[{"Names":["offset","o"]},{"Names":["length","l"]}]},{"Name":"name","Subcommands":[{"Name":"publish","Subcommands":[],"Options":[{"Names":["resolve"]},{"Names":["lifetime","t"]},{"Names":["ttl"]},{"Names":["key","k"]}]},{"Name":"resolve","Subcommands":[],"Options":[{"Names":["recursive","r"]},{"Names":["nocache","n"]}]},{"Name":"pubsub","Subcommands":[{"Name":"state","Subcommands":[],"Options":[]},{"Name":"subs","Subcommands":[],"Options":[]},{"Name":"cancel","Subcommands":[],"Options":[]}],"Options":[]}],"Options":[]},{"Name":"resolve","Subcommands":[],"Options":[{"Names":["recursive","r"]}]},{"Name":"file","Subcommands":[{"Name":"ls","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"commands","Subcommands":[],"Options":[{"Names":["flags","f"]}]},{"Name":"repo","Subcommands":[{"Name":"stat","Subcommands":[],"Options":[{"Names":["human"]}]},{"Name":"gc","Subcommands":[],"Options":[{"Names":["stream-errors"]},{"Names":["quiet","q"]}]},{"Name":"fsck","Subcommands":[],"Options":[]},{"Name":"version","Subcommands":[],"Options":[{"Names":["quiet","q"]}]},{"Name":"verify","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"log","Subcommands":[{"Name":"ls","Subcommands":[],"Options":[]},{"Name":"tail","Subcommands":[],"Options":[]},{"Name":"level","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"refs","Subcommands":[{"Name":"local","Subcommands":[],"Options":[]}],"Options":[{"Names":["format"]},{"Names":["edges","e"]},{"Names":["unique","u"]},{"Names":["recursive","r"]}]},{"Name":"update","Subcommands":[],"Options":[]},{"Name":"version","Subcommands":[],"Options":[{"Names":["number","n"]},{"Names":["commit"]},{"Names":["repo"]},{"Names":["all"]}]},{"Name":"dht","Subcommands":[{"Name":"provide","Subcommands":[],"Options":[{"Names":["verbose","v"]},{"Names":["recursive","r"]}]},{"Name":"query","Subcommands":[],"Options":[{"Names":["verbose","v"]}]},{"Name":"findprovs","Subcommands":[],"Options":[{"Names":["verbose","v"]},{"Names":["num-providers","n"]}]},{"Name":"findpeer","Subcommands":[],"Options":[{"Names":["verbose","v"]}]},{"Name":"get","Subcommands":[],"Options":[{"Names":["verbose","v"]}]},{"Name":"put","Subcommands":[],"Options":[{"Names":["verbose","v"]}]}],"Options":[]},{"Name":"key","Subcommands":[{"Name":"rename","Subcommands":[],"Options":[{"Names":["force","f"]}]},{"Name":"rm","Subcommands":[],"Options":[{"Names":["l"]}]},{"Name":"gen","Subcommands":[],"Options":[{"Names":["type","t"]},{"Names":["size","s"]}]},{"Name":"list","Subcommands":[],"Options":[{"Names":["l"]}]}],"Options":[]},{"Name":"ls","Subcommands":[],"Options":[{"Names":["headers","v"]},{"Names":["resolve-type"]}]},{"Name":"object","Subcommands":[{"Name":"patch","Subcommands":[{"Name":"append-data","Subcommands":[],"Options":[]},{"Name":"add-link","Subcommands":[],"Options":[{"Names":["create","p"]}]},{"Name":"rm-link","Subcommands":[],"Options":[]},{"Name":"set-data","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"put","Subcommands":[],"Options":[{"Names":["inputenc"]},{"Names":["datafieldenc"]},{"Names":["pin"]},{"Names":["quiet","q"]}]},{"Name":"stat","Subcommands":[],"Options":[]},{"Name":"data","Subcommands":[],"Options":[]},{"Name":"diff","Subcommands":[],"Options":[{"Names":["verbose","v"]}]},{"Name":"get","Subcommands":[],"Options":[]},{"Name":"links","Subcommands":[],"Options":[{"Names":["headers","v"]}]},{"Name":"new","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"pin","Subcommands":[{"Name":"update","Subcommands":[],"Options":[{"Names":["unpin"]}]},{"Name":"add","Subcommands":[],"Options":[{"Names":["recursive","r"]},{"Names":["progress"]}]},{"Name":"rm","Subcommands":[],"Options":[{"Names":["recursive","r"]}]},{"Name":"ls","Subcommands":[],"Options":[{"Names":["type","t"]},{"Names":["quiet","q"]}]},{"Name":"verify","Subcommands":[],"Options":[{"Names":["verbose"]},{"Names":["quiet","q"]}]}],"Options":[]},{"Name":"swarm","Subcommands":[{"Name":"addrs","Subcommands":[{"Name":"local","Subcommands":[],"Options":[{"Names":["id"]}]},{"Name":"listen","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"connect","Subcommands":[],"Options":[]},{"Name":"disconnect","Subcommands":[],"Options":[]},{"Name":"filters","Subcommands":[{"Name":"rm","Subcommands":[],"Options":[]},{"Name":"add","Subcommands":[],"Options":[]}],"Options":[]},{"Name":"peers","Subcommands":[],"Options":[{"Names":["verbose","v"]},{"Names":["streams"]},{"Names":["latency"]}]}],"Options":[]}]
     * Options : [{"Names":["config","c"]},{"Names":["debug","D"]},{"Names":["help"]},{"Names":["h"]},{"Names":["local","L"]},{"Names":["api"]},{"Names":["encoding","enc"]},{"Names":["stream-channels"]},{"Names":["timeout"]}]
     */

    private String Name;
    private List<SubcommandsBean> Subcommands;
    private List<OptionsBeanX> Options;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<SubcommandsBean> getSubcommands() {
        return Subcommands;
    }

    public void setSubcommands(List<SubcommandsBean> Subcommands) {
        this.Subcommands = Subcommands;
    }

    public List<OptionsBeanX> getOptions() {
        return Options;
    }

    public void setOptions(List<OptionsBeanX> Options) {
        this.Options = Options;
    }

    public static class SubcommandsBean {
        /**
         * Name : add
         * Subcommands : []
         * Options : [{"Names":["recursive","r"]},{"Names":["quiet","q"]},{"Names":["quieter","Q"]},{"Names":["silent"]},{"Names":["progress","p"]},{"Names":["trickle","t"]},{"Names":["only-hash","n"]},{"Names":["wrap-with-directory","w"]},{"Names":["hidden","H"]},{"Names":["chunker","s"]},{"Names":["pin"]},{"Names":["raw-leaves"]},{"Names":["nocopy"]},{"Names":["fscache"]},{"Names":["cid-version"]},{"Names":["hash"]}]
         */

        private String Name;
        private List<?> Subcommands;
        private List<OptionsBean> Options;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public List<?> getSubcommands() {
            return Subcommands;
        }

        public void setSubcommands(List<?> Subcommands) {
            this.Subcommands = Subcommands;
        }

        public List<OptionsBean> getOptions() {
            return Options;
        }

        public void setOptions(List<OptionsBean> Options) {
            this.Options = Options;
        }

        public static class OptionsBean {
            private List<String> Names;

            public List<String> getNames() {
                return Names;
            }

            public void setNames(List<String> Names) {
                this.Names = Names;
            }
        }
    }

    public static class OptionsBeanX {
        private List<String> Names;

        public List<String> getNames() {
            return Names;
        }

        public void setNames(List<String> Names) {
            this.Names = Names;
        }
    }

    @Override
    public String toString() {
        return "Commands{" +
                "Name='" + Name + '\'' +
                ", Subcommands=" + Subcommands +
                ", Options=" + Options +
                '}';
    }
}
