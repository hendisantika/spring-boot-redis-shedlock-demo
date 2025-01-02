package id.my.hendisantika.redisshedlockdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Testcontainers
class SpringBootRedisShedlockDemoApplicationTests {

    @Container
    // When using Testcontainers, connection details can be automatically created for a service running in a container
    @ServiceConnection
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(
            "postgres:17-alpine"
    );

    @Test
    public void testEmptyList() {
        assertTrue(postgres.isRunning(), "PostgreSQL container should be running");
    }

}
