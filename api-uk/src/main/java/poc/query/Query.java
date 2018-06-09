package poc.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import poc.model.IdentityUk;
import poc.model.RequestUk;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;


@Component
public class Query implements GraphQLQueryResolver {

    private static final List<IdentityUk> IDENTITIES = asList(
            new IdentityUk(1L, "Luke", "Miller", "123"),
            new IdentityUk(2L, "Kolten", "Harmon", "456")
    );


    public List<IdentityUk> findIdentities(RequestUk requestUk) {
        return IDENTITIES.stream()
                .filter(identity -> identity.getFirstName().equals(requestUk.getFirstName()))
                .filter(identity -> identity.getPostCode().equals(requestUk.getPostCode()))
                .collect(toList());
    }
}
