package com.xue.client.designpatterns.builder.lombok;

import lombok.*;

/**
 * 添加无参构造器是使用@Builder注解
 * 需要添加全参构造器（@Builder的构建者模式默认使用的是全参构造器）
 * 1. @Getter/@Setter：作用于类上，生成所有成员变量的getter/settert方法；作用于成员变量上，生成该成员变量的getter/setter方法。可以设定访问权限以及是否懒加载
 *  2. @ToString：作用于类，覆盖默认的toString()方法，可以通过of属性限定显示某些字段，通过exclude属性排除某些字段
 *  3. @EqualsAndHashCode：作用于类，覆盖默认的equals和hashCode
 *  4. @NonNull：主要作用于成员变量和参数中，标识不能为空，否则抛出空指针异常
 *  5. @NoArgsconstruct：生成无参构造器
 *  6. @RequiredArgsConstructor：生成包含final和@NonNull注解的成员变量的构造器
 *  7. @AllArgsConstructor：生成全参构造器
 *  8. @Data：作用于类上，是以下注解的集合：@ToString、@EqualsAndHashCode、@Getter、@Setter、@RequiredArgsConstructor
 *  9. @Builder：作用于类上，将类转变为建造者模式
 *  10. @Log：作用于类上，生成日志变量
 *  11. @Cleanup：自动关闭资源，针对实现了java.io.Closeable接口的对象有效，如：典型的IO流对象
 *  12. @SneakyThrows：可以对受检异常进行捕捉并抛出
 * @author QSNP253
 * @param <T>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Result<T> {
    private T data;
    private String code;
    private String msg;
}
