package com.duan.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
//@ConfigurationProperties(prefix = "oss.config")
public class OSSConfig {

    public boolean enable = false;

    public String endpoint = "http://oss-cn-beijing.aliyuncs.com";

    public String accesskeyid = "LTAI5tKrTXbZiAfiN8Qht3Mg";

    public String accesskeysecret = "IfvxszrmvNU5P1v189bvjz9G0yA3Qe";

    public String bucketname = "myduanbucket";

    public String key = "images/upload/";

    public String host = "https://myduanbucket.oss-cn-beijing.aliyuncs.com/";

}
