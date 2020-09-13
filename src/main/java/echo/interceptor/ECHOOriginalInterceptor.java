package echo.interceptor;

import br.com.douglas444.dsframework.interceptor.ConsumerOrRunnableInterceptor;
import echo.interceptor.context.ClusteredConceptContext;

public class ECHOOriginalInterceptor {

    public final ConsumerOrRunnableInterceptor<ClusteredConceptContext> CLASSIFIER_UPDATE;
    public final ConsumerOrRunnableInterceptor<ClusteredConceptContext> NOVEL_CLASS_EMERGENCE;

    public ECHOOriginalInterceptor() {

        this.CLASSIFIER_UPDATE = new ConsumerOrRunnableInterceptor<>();
        this.NOVEL_CLASS_EMERGENCE = new ConsumerOrRunnableInterceptor<>();

    }
}
