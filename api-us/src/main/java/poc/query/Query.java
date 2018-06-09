package poc.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import poc.model.IdentityUs;
import poc.model.RequestUs;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;


@Component
public class Query implements GraphQLQueryResolver {

    private static final List<IdentityUs> IDENTITIES = asList(
            new IdentityUs(1L, "David", "Robinson", "123"),
            new IdentityUs(2L, "William", "Watts", "456")
    );


    public List<IdentityUs> findIdentities(RequestUs requestUs) {
        return IDENTITIES.stream()
                .filter(identity -> identity.getFirstName().equals(requestUs.getFirstName()))
                .filter(identity -> identity.getZip().equals(requestUs.getZip()))
                .collect(toList());
    }
}
