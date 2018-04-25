import redis.clients.jedis.Jedis;

public class JedisDemo {

	
	public static void main(String[] args) {
		//连接本地的 Redis 服务
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        //if your redis-service not need password, pass next code.
        jedis.auth("123456");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        
//        jedis.append("name", "juincen");
        jedis.select(0);
//        jedis.set("work", "[{\"place\":\"km\"}]");
        System.out.println(jedis.get("work"));
        jedis.close();
	}
	
}
