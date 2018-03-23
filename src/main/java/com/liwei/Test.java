package com.liwei;

import com.liwei.redis.RedisUtil;
import redis.clients.jedis.Jedis;

/**
 * Created by dell on 2018/3/9.
 */
public class Test {

        private static Jedis redis = null;
        public static void main(String[] args){

            redis = RedisUtil.getJedis();
            redis.set("name","帅的不要不要的");//向key-->name中放入了value-->帅的不要不要的
            String value=redis.get("name");
            System.out.println("name:"+value);
//            RedisUtil.returnResource(redis);
            for(int i=1; i< 1124 ;i++) {
                final int j = i;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.currentThread().sleep(1000);
                            System.out.println("休眠了");
                        }catch (Exception e){

                        }
                        System.out.println(Thread.currentThread().getName()+"-----"+j);
                        Jedis j1 = RedisUtil.getJedis();
                        j1.set("name",""+j);//向key-->name中放入了value-->帅的不要不要的
                        String value=j1.get("name");
                        System.out.println("name:"+value);
                    }
                }).start();
            }

//
//            // 1.初始化
//
//            redis = new Jedis("127.0.0.1", 6379);      //第二种方式 redis.clients 连接
//            System.out.println("reids连接成功...");
//            //获取redis中对应的value值
//            redis.set("name","帅的不要不要的");//向key-->name中放入了value-->帅的不要不要的
//            String value=redis.get("name");
//            System.out.println("name:"+value);
//
//            String  myvalue =redis.get("Mykey");
//            System.out.println("Mykey:"+myvalue);
//
//
//            // 2.测试concurrentMap,put方法的时候就会同步到redis中
//            Config config = new Config();
//            config.setConnectionPoolSize(10);
//            config.addAddress("127.0.0.1:6379");
//            Redisson redisson = Redisson.create(config);  //第一种方式 Redisson 连接
//            ConcurrentMap<String, Object> map = redisson.getMap("FirstMap");
//            map.put("wuguowei", "男");
//            map.put("zhangsan", "nan");
//            map.put("lisi", "女");
//
//            ConcurrentMap resultMap = redisson.getMap("FirstMap");
//            System.out.println("resultMap==" + resultMap.keySet());
//
//            // 2.测试Set集合
//            Set mySet = redisson.getSet("MySet");
//            mySet.add("wuguowei");
//            mySet.add("lisi");
//
//            Set resultSet = redisson.getSet("MySet");
//            System.out.println("resultSet===" + resultSet.size());
//
//            //3.测试Queue队列
//            Queue myQueue = redisson.getQueue("FirstQueue");
//            myQueue.add("wuguowei");
//            myQueue.add("lili");
//            myQueue.add("zhangsan");
//            myQueue.peek();
//            myQueue.poll();
//
//            Queue resultQueue=redisson.getQueue("FirstQueue");
//            System.out.println("resultQueue==="+resultQueue);
//
//            // 关闭连接
//            redisson.shutdown();
        }

}
