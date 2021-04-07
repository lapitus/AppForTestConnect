package AppForTestConnect.service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@Service
//@RequiredArgsConstructor
@Slf4j
public class ServiceData {


//    public static final Logger LOG = LoggerFactory.getLogger(ServiceData.class);
//
//    @NotNull
//    private final DataSource dataSource;
//
//    @NotNull
//    public String getDual() {
//        String result = "unknown";
//        InetAddress inetAddress = null;
//             try(final Connection connection = dataSource.getConnection();
//                 final Statement s2 = connection.createStatement();){
//                 inetAddress =InetAddress.getLocalHost();
//
//                  {
//                     try (final ResultSet rs2 = s2.executeQuery("select to_char(sysdate, 'DD.MM.YYYY hh24:mi:ss') || " +
//                             "' ' ||(select max(name) from v$services) from dual")) {
//                         if (rs2.next()) {
//                             result = rs2.getString(1);
//                         }
//                     }
//                 }
//             }
//             catch (SQLException | UnknownHostException e){
//                 LOG.info(String.format("%s %s ","getDual ", e.getMessage()));
//             }
//        return  (String.format("%s %s %s ", "B", inetAddress.getHostAddress() ,result)) ;
//        }

    }



