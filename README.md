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
 :: Spring Boot ::                (v3.2.3)

2024-03-16T08:40:56.185+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.SpringWebfluxDockerComposeApplication : Starting SpringWebfluxDockerComposeApplication using Java 21 with PID 7893 (/Users/hendisantika/IdeaProjects/spring-webflux-docker-compose/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/spring-webflux-docker-compose)
2024-03-16T08:40:56.186+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.SpringWebfluxDockerComposeApplication : No active profile set, falling back to 1 default profile: "default"
2024-03-16T08:40:56.208+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-03-16T08:40:56.208+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2024-03-16T08:40:56.216+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.b.d.c.l.DockerComposeLifecycleManager : Using Docker Compose file '/Users/hendisantika/IdeaProjects/spring-webflux-docker-compose/compose.yaml'
2024-03-16T08:40:56.724+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-db-1  Created
2024-03-16T08:40:56.725+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-redis-1  Created
2024-03-16T08:40:56.727+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-redis-1  Starting
2024-03-16T08:40:56.727+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-db-1  Starting
2024-03-16T08:40:57.039+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-redis-1  Started
2024-03-16T08:40:57.061+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-db-1  Started
2024-03-16T08:40:57.062+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-redis-1  Waiting
2024-03-16T08:40:57.062+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-db-1  Waiting
2024-03-16T08:40:57.566+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-redis-1  Healthy
2024-03-16T08:40:57.567+07:00  INFO 7893 --- [spring-webflux-docker-compose] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container spring-webflux-docker-compose-db-1  Healthy
2024-03-16T08:41:00.001+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-03-16T08:41:00.001+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data R2DBC repositories in DEFAULT mode.
2024-03-16T08:41:00.067+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 64 ms. Found 1 R2DBC repository interface.
2024-03-16T08:41:00.075+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode
2024-03-16T08:41:00.075+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-03-16T08:41:00.080+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface id.my.hendisantika.springwebfluxdockercompose.book.BookRepository; If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository
2024-03-16T08:41:00.080+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 1 ms. Found 0 Redis repository interfaces.
2024-03-16T08:41:00.410+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-03-16T08:41:00.454+07:00 ERROR 7893 --- [spring-webflux-docker-compose] [  restartedMain] i.n.r.d.DnsServerAddressStreamProviders  : Unable to load io.netty.resolver.dns.macos.MacOSDnsServerAddressStreamProvider, fallback to system defaults. This may result in incorrect DNS resolutions on MacOS. Check whether you have a dependency on 'io.netty:netty-resolver-dns-native-macos'. Use DEBUG level to see the full stack: java.lang.UnsatisfiedLinkError: failed to load the required native library
2024-03-16T08:41:00.903+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8081
2024-03-16T08:41:00.907+07:00  INFO 7893 --- [spring-webflux-docker-compose] [  restartedMain] .s.SpringWebfluxDockerComposeApplication : Started SpringWebfluxDockerComposeApplication in 4.882 seconds (process running for 5.317)
Book[id=8, title=To Kill a Mockingbird, isbn=0446310786]
Book[id=9, title=1984, isbn=0451524934]
Book[id=11, title=The Great Gatsby, isbn=0743273567]
Book[id=12, title=One Hundred Years of Solitude, isbn=0060883286]
Book[id=7, title=The Catcher in the Rye, isbn=0316769487]
Book[id=10, title=Animal Farm, isbn=0451526341]
```
