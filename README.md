# spring-webflux-docker-compose

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-webflux-docker-compose.git`
2. Navigate to the folder: `cd spring-webflux-docker-compose`
3. Run the application: `mvn clean spring-boot:run`

### Console Log

```shell
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2024-05-06T09:57:42.699+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.SpringWebfluxDockerComposeApplication : Starting SpringWebfluxDockerComposeApplication using Java 21 with PID 51331 (/Users/hendisantika/IdeaProjects/spring-webflux-docker-compose/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/spring-webflux-docker-compose)
2024-05-06T09:57:42.699+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.SpringWebfluxDockerComposeApplication : No active profile set, falling back to 1 default profile: "default"
2024-05-06T09:57:42.701+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.b.d.c.l.DockerComposeLifecycleManager : Using Docker Compose file '/Users/hendisantika/IdeaProjects/spring-webflux-docker-compose/compose.yaml'
2024-05-06T09:57:43.180+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.b.d.c.l.DockerComposeLifecycleManager : There are already Docker Compose services running, skipping startup
2024-05-06T09:57:43.243+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-05-06T09:57:43.243+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data R2DBC repositories in DEFAULT mode.
2024-05-06T09:57:43.245+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 2 ms. Found 1 R2DBC repository interface.
2024-05-06T09:57:43.246+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-05-06T09:57:43.246+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-05-06T09:57:43.247+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface id.my.hendisantika.springwebfluxdockercompose.book.BookRepository; If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository
2024-05-06T09:57:43.247+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 0 ms. Found 0 Redis repository interfaces.
2024-05-06T09:57:43.290+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-05-06T09:57:43.393+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8081
2024-05-06T09:57:43.395+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .s.SpringWebfluxDockerComposeApplication : Started SpringWebfluxDockerComposeApplication in 0.706 seconds (process running for 15.445)
2024-05-06T09:57:43.400+07:00  INFO 51331 --- [spring-webflux-docker-compose] [  restartedMain] .ConditionEvaluationDeltaLoggingListener : Condition evaluation unchanged
Book[id=7, title=The Catcher in the Rye, isbn=0316769487]
Book[id=8, title=To Kill a Mockingbird, isbn=0446310786]
Book[id=9, title=Animal Farm, isbn=0451526341]
Book[id=10, title=1984, isbn=0451524934]
Book[id=11, title=One Hundred Years of Solitude, isbn=0060883286]
Book[id=12, title=The Great Gatsby, isbn=0743273567]
```
