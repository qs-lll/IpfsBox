package org.ipfsbox.library.entity;

import java.util.List;

public class Dag {
    public static class get {

        /**
         * data : CAIYzLo1IICAECCAgBAggIAQIMy6BQ==
         * links : [{"Name":"","Size":262158,"Cid":{"/":"Qmb4xjbfGxf7t7XTGgHq7oraqq5FPmAKeahNegmRqLJDLR"}},{"Name":"","Size":262158,"Cid":{"/":"QmRxfkUGHGeRMmq9UaChZqYbGQJmxKvewVvAYhWPX5BC1t"}},{"Name":"","Size":262158,"Cid":{"/":"QmRJWy1i4339AnBtfP6r8PymHdp7N35g4JnyC4wQZt76EF"}},{"Name":"","Size":89434,"Cid":{"/":"QmVwajgYQ6ZMNBSshNep72q47CtB9e8F7LATV95HQpUcdE"}}]
         */

        private String data;
        private List<LinksBean> links;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public List<LinksBean> getLinks() {
            return links;
        }

        public void setLinks(List<LinksBean> links) {
            this.links = links;
        }

        public static class LinksBean {
            /**
             * Name :
             * Size : 262158
             * Cid : {"/":"Qmb4xjbfGxf7t7XTGgHq7oraqq5FPmAKeahNegmRqLJDLR"}
             */

            private String Name;
            private int Size;
            private CidBean Cid;

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public int getSize() {
                return Size;
            }

            public void setSize(int Size) {
                this.Size = Size;
            }

            public CidBean getCid() {
                return Cid;
            }

            public void setCid(CidBean Cid) {
                this.Cid = Cid;
            }

            public static class CidBean {
                private String _$229; // FIXME check this code

                public String get_$229() {
                    return _$229;
                }

                public void set_$229(String _$229) {
                    this._$229 = _$229;
                }
            }
        }
    }
}
