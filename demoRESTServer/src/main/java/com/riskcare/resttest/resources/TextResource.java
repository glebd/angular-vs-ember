package com.riskcare.resttest.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * User: chris
 * Date: 07/12/13
 * Time: 23:37
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/text")
public class TextResource {
     public static final String LOREM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec dignissim neque sed volutpat tempor. Suspendisse potenti. Donec condimentum nisl nunc, a porta purus congue vel. Morbi egestas eleifend ipsum ut sodales. Vestibulum nunc felis, commodo vitae risus eget, viverra pharetra lorem. Mauris a est mattis, iaculis justo eu, aliquet neque. Morbi molestie tortor et sapien molestie vehicula. Maecenas hendrerit dolor ac risus ornare, vel porttitor magna dictum. Vivamus vitae dolor eu nunc auctor consequat a ut diam. Maecenas justo turpis, tristique in enim id, ultrices semper tortor. Nunc placerat id erat in viverra. Mauris eu cursus nisl, in ultrices enim. Proin ut venenatis dolor.\n" +
             "\n" +
             "Mauris porttitor vestibulum dignissim. Phasellus malesuada malesuada scelerisque. Nam vel gravida nisi. Aliquam nisl libero, mollis sit amet imperdiet a, vulputate vitae justo. Ut volutpat, libero at placerat fermentum, mi neque elementum ante, a mollis lacus quam vitae eros. Sed sodales ultrices arcu. Phasellus sed quam eget velit dignissim vestibulum vel bibendum massa. Ut congue nec lacus in feugiat. Morbi congue interdum blandit. Vestibulum rutrum malesuada fringilla. In condimentum, velit sit amet egestas mollis, tortor velit blandit ipsum, in placerat libero nibh commodo augue.\n" +
             "\n" +
             "Interdum et malesuada fames ac ante ipsum primis in faucibus. Duis ultrices consectetur nulla eu tempor. Nam sed elit a quam consectetur faucibus nec ut dolor. Maecenas libero libero, sagittis eget accumsan eget, pharetra at libero. Quisque eu faucibus ligula, non accumsan tortor. Vivamus aliquam, sem in faucibus commodo, nunc augue rutrum libero, vel commodo arcu orci non nulla. Curabitur eu justo tincidunt, dictum nisl vitae, iaculis purus. Phasellus varius mauris vel metus sagittis, non pellentesque purus sagittis. Nulla facilisis dolor eget magna blandit, a ornare tellus viverra. Integer eget porta turpis. Nullam pretium id orci id gravida. Donec eget mi at magna ultrices posuere. Proin eu lectus enim.\n" +
             "\n" +
             "Integer eget lacus non ipsum consequat fringilla. Aliquam ultrices suscipit ipsum, non rhoncus enim tincidunt vitae. Etiam ultricies sollicitudin varius. Sed non consectetur mauris. Nam metus eros, semper vel diam in, fermentum luctus odio. Morbi id mauris sit amet nisi aliquam aliquam vitae at lacus. Quisque condimentum orci vel turpis consequat, non porttitor mi tristique. Fusce ullamcorper massa varius blandit semper. Duis lacus tellus, tincidunt et pulvinar sed, egestas vitae dolor.\n" +
             "\n" +
             "Morbi non iaculis mauris, ut congue mauris. Cras rhoncus magna vel lectus tempor aliquet. Aliquam feugiat malesuada quam eu varius. Etiam pellentesque iaculis consequat. Quisque sed risus quis mauris rhoncus scelerisque sed nec nunc. Nunc lacinia ante sed nisi euismod lacinia. Maecenas sed nunc ut arcu interdum consequat. Cras mattis, dolor et ultrices cursus, enim justo porta lectus, at placerat risus orci quis nunc.\n" +
             "\n" +
             "Praesent pulvinar sagittis massa, a pretium purus. Nunc at molestie diam, nec pellentesque quam. Curabitur urna dolor, pretium in dictum sed, volutpat sed quam. Nunc sodales libero quis massa scelerisque, vel dignissim mi laoreet. Maecenas non sagittis quam. Donec a magna vitae urna viverra pharetra vel rutrum ante. Cras malesuada nisl sit amet tellus eleifend, sed feugiat augue auctor. Vestibulum tincidunt ac diam tincidunt porta. Aliquam interdum augue libero, ut tempus mi tempus eu. Donec risus odio, convallis et diam non, condimentum egestas felis. Integer ac consequat sapien, in dapibus neque.\n" +
             "\n" +
             "Fusce fermentum, erat eget vehicula auctor, turpis enim tristique nisi, ut aliquam enim arcu quis risus. Mauris nunc leo, tincidunt quis nulla hendrerit, vehicula sodales libero. Etiam accumsan mi a leo fermentum fringilla ac consequat leo. Morbi iaculis justo ligula, at mollis elit malesuada ac. Phasellus leo purus, suscipit sit amet ultrices nec, imperdiet ut dolor. Etiam imperdiet ac neque nec molestie. Vestibulum auctor elementum tristique. Curabitur fermentum rhoncus leo, at dictum est pellentesque sed. Interdum et malesuada fames ac ante ipsum primis in faucibus. Duis a mauris ac libero imperdiet egestas. Vivamus imperdiet pretium lorem a aliquet. Nunc id tempor ligula, sed tincidunt mauris. Quisque sagittis, erat sed euismod malesuada, lorem mauris dapibus mi, consectetur volutpat sem turpis et felis.\n" +
             "\n" +
             "Donec est turpis, dictum non consequat in, accumsan non arcu. Donec adipiscing ac magna et interdum. Aenean aliquam tincidunt urna vel luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam vel pulvinar elit. Phasellus iaculis fermentum nunc, in tempor sem venenatis eu. Donec sit amet adipiscing lectus.\n" +
             "\n" +
             "Fusce in erat et lorem laoreet pharetra. Donec id malesuada leo. Ut eget urna mauris. Duis posuere tristique ipsum vitae iaculis. Mauris at neque euismod, dignissim dolor ac, gravida turpis. Morbi suscipit viverra tellus, a tristique lectus luctus et. Morbi vulputate nulla sem, sed feugiat odio condimentum et. Pellentesque ornare erat in nunc euismod, sed interdum nulla tincidunt. Cras varius nisl euismod quam scelerisque pulvinar. Integer sit amet magna mi. Morbi lobortis erat dolor, in dapibus velit fermentum mattis. Curabitur ultrices arcu ut lectus pulvinar, ultrices porta tortor suscipit.\n" +
             "\n" +
             "Suspendisse non dictum enim. Aliquam auctor nibh quis nibh cursus, eu accumsan est hendrerit. Mauris cursus, dolor sed posuere porta, enim est ultricies lorem, ut dapibus mauris justo sed turpis. Phasellus malesuada volutpat felis sit amet hendrerit. Proin iaculis ac nibh in adipiscing. Nunc ipsum odio, mollis eget varius et, ultrices sit amet magna. Vestibulum scelerisque sem lacus, in vulputate magna vehicula elementum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Vestibulum vel dolor a nibh imperdiet aliquam sit amet sit amet dolor. Donec in mi ut odio gravida pretium. Maecenas id accumsan eros. Maecenas nec mollis arcu, eget dignissim sem. Suspendisse euismod convallis justo quis vehicula. Nunc rhoncus euismod sagittis. Curabitur porttitor varius risus nec pharetra. Duis dictum justo elit, et aliquet mauris porttitor eu.\n" +
             "\n" +
             "Sed ut imperdiet neque, quis mattis leo. Vestibulum adipiscing sem quis sapien scelerisque placerat. Etiam gravida ante vel nibh tempus, a imperdiet nisl egestas. Suspendisse potenti. Nulla dictum euismod tellus, et porttitor metus aliquet sit amet. Nullam hendrerit viverra nulla ac feugiat. Donec eget massa fringilla, varius risus a, lacinia dolor. Curabitur commodo, est eu elementum accumsan, massa est congue tellus, at feugiat leo mi eget nunc. Curabitur suscipit dignissim enim, sed viverra quam egestas id. Aenean lacinia imperdiet diam vitae luctus. Quisque vulputate magna non molestie scelerisque.\n" +
             "\n" +
             "Sed eu fermentum odio. Nullam id adipiscing ante, nec rutrum justo. Nulla sed tincidunt felis. Donec eu tellus risus. Integer luctus sed risus sit amet lacinia. Quisque ante lorem, porttitor porttitor malesuada porta, fringilla eget turpis. In rutrum eu enim eget euismod. Aliquam erat volutpat. In est augue, interdum vel lobortis ac, aliquet laoreet elit. Curabitur sit amet metus adipiscing, viverra enim nec, egestas nisl.\n" +
             "\n" +
             "In ornare adipiscing mi, ac gravida mi adipiscing eget. Donec cursus est et velit scelerisque vestibulum at sed tellus. Sed eleifend erat quis est semper, quis laoreet sapien commodo. Fusce velit eros, gravida id orci ullamcorper, porttitor imperdiet erat. Sed ac commodo nulla, ornare ornare sem. Integer lectus nibh, sagittis eget elementum quis, volutpat non diam. Pellentesque bibendum tincidunt sodales. In hac habitasse platea dictumst. Nam egestas tortor vitae ipsum vulputate, vitae vehicula massa suscipit. Cras luctus odio et imperdiet vulputate. In ut dolor in leo pellentesque ultricies in vitae velit. Ut at nibh dolor. Praesent dolor sapien, suscipit cursus risus a, molestie eleifend eros.\n" +
             "\n" +
             "Etiam adipiscing dui bibendum pulvinar convallis. Nunc accumsan viverra ante a malesuada. Aenean eu sapien vel mauris blandit mattis. Sed nec justo mollis, cursus nibh et, condimentum urna. Etiam vel lacinia augue. Aenean interdum imperdiet metus eu consequat. Phasellus dignissim fermentum adipiscing.\n" +
             "\n" +
             "In hac habitasse platea dictumst. Morbi dictum posuere consectetur. Morbi pretium eros in adipiscing ultrices. Mauris blandit nisi vitae neque commodo, quis interdum nulla dictum. Aenean sit amet accumsan turpis, eget accumsan justo. Donec placerat porta diam a lacinia. Vivamus a ultrices felis. Cras lobortis vitae massa in hendrerit. Vestibulum lobortis luctus nunc sit amet pulvinar. Vivamus mi ipsum, viverra quis ante lacinia, adipiscing pretium sapien. Cras condimentum dignissim diam id convallis. Duis eget odio iaculis, congue sapien id, tempus tellus. Nunc ac rhoncus nibh. Ut et libero euismod, egestas nisl id, euismod odio. Curabitur tellus tortor, vestibulum ac tristique condimentum, laoreet eu purus. In lacinia elit sit amet leo aliquam bibendum.\n" +
             "\n" +
             "Phasellus cursus vulputate egestas. Phasellus euismod facilisis mi non tempus. Vivamus pellentesque porttitor tortor, mollis cursus nibh volutpat nec. Phasellus urna mauris, lobortis vel vulputate nec, eleifend auctor mauris. Ut congue congue turpis vel rhoncus. Fusce non auctor arcu. Donec a urna massa. Quisque semper, purus at molestie volutpat, quam felis molestie augue, nec dapibus sem felis at tortor. Ut ac congue nisi. Quisque placerat ante ut enim semper tristique. Duis eleifend commodo ligula laoreet lacinia. Morbi nec mattis tortor. Nullam dignissim enim purus. Morbi vestibulum suscipit lectus, eu pulvinar augue elementum placerat.\n" +
             "\n" +
             "Nulla facilisi. Quisque suscipit mauris leo, et gravida tortor ultricies eu. Aenean convallis lorem non eros vulputate aliquam. Cras sagittis euismod odio, at luctus est vulputate bibendum. Vestibulum hendrerit semper purus, ut aliquam lectus rutrum id. Sed id pellentesque sapien. Integer vel euismod arcu. Vivamus sapien augue, suscipit id molestie sit amet, viverra id nisl. Duis ut tristique arcu. Phasellus nec arcu fermentum, consequat quam sed, lacinia mauris. Proin hendrerit augue sed tristique pretium.\n" +
             "\n" +
             "Mauris molestie odio purus. Praesent ultricies arcu ac tempus imperdiet. Duis porttitor mollis luctus. Nullam a accumsan diam. Phasellus rhoncus varius elit sed eleifend. Proin non augue viverra, rhoncus diam eget, luctus mi. Etiam pulvinar, tellus sit amet fringilla pharetra, dolor velit dictum nunc, in faucibus ipsum arcu eget tortor. Donec consequat metus a erat porttitor condimentum. Integer euismod condimentum odio eget viverra. Mauris nunc elit, posuere a ornare quis, bibendum at nibh.\n" +
             "\n" +
             "Praesent ultrices ultricies nisl. Curabitur ultricies mi ligula, sed condimentum nisl placerat sed. Pellentesque viverra dictum diam at volutpat. Cras a bibendum nisl, vitae interdum urna. Nam eget pulvinar est. Nam egestas accumsan tortor sed vestibulum. Pellentesque sed odio in lacus sollicitudin luctus.\n" +
             "\n" +
             "Quisque accumsan mauris sapien, at consectetur dui egestas ut. Integer sagittis, lorem euismod ultricies scelerisque, odio turpis molestie massa, at elementum ipsum ligula vel ligula. Ut non facilisis sem, pharetra sagittis elit. Aenean lorem sapien, ultrices vel porta vel, varius a arcu. In sed viverra enim. Vestibulum et interdum nunc. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec quis mi sapien. In tempus nulla vitae nulla rutrum, nec fringilla libero consectetur. Nunc auctor tristique massa id porta. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla pretium nisi a scelerisque venenatis.\n" +
             "\n" +
             "Cras tincidunt consectetur arcu sit amet eleifend. Praesent consectetur justo est, ullamcorper tempus lectus faucibus eget. Vivamus sagittis enim in quam pharetra consequat. Aliquam eu aliquet nulla. Vestibulum nec lectus ut nunc convallis varius. Suspendisse ut sodales sapien. Vivamus id diam sit amet nunc dignissim mattis. Donec malesuada, lacus id hendrerit auctor, elit tellus posuere lectus, ut pharetra velit ante non metus. Duis hendrerit nulla id velit luctus scelerisque. Nunc ullamcorper convallis feugiat. Duis scelerisque ac diam nec dignissim. Proin mollis, ipsum in aliquam porta, massa risus ultricies enim, at pellentesque orci massa at massa. Aliquam erat tellus, rutrum non leo sit amet, convallis sodales lacus. Nulla posuere lorem quis nisl tristique mollis. Nulla mollis venenatis dui, non vestibulum metus sagittis a. Vestibulum justo diam, facilisis non condimentum in, facilisis in nisi.\n" +
             "\n" +
             "Nunc tincidunt sem non odio lobortis, non faucibus eros convallis. Ut nec venenatis nisl. Suspendisse lorem tortor, gravida a vestibulum ut, pharetra ac tortor. Proin ullamcorper euismod lobortis. Vestibulum elementum in odio ac dictum. Morbi a risus vel justo porta tristique. Nulla facilisi.\n" +
             "\n" +
             "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. In a rutrum odio. Sed et leo dapibus, consequat erat nec, pharetra mi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et lobortis tellus. Suspendisse potenti. Etiam molestie elit vel est adipiscing, in placerat tortor egestas. Nullam mattis urna eget enim viverra tincidunt. Sed ultrices orci id tellus bibendum consequat. Donec bibendum, augue in aliquam varius, sapien dui tristique est, eget auctor augue ante ut est.\n" +
             "\n" +
             "Phasellus massa sem, gravida congue accumsan sed, auctor at ante. Etiam ac velit lectus. Duis eu mauris mattis, dapibus odio sit amet, blandit urna. Donec sodales quam est, nec dignissim risus ornare quis. Etiam aliquam sodales vulputate.";
    @GET
    @Path("loremipsum")
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public String loremIpsum(@QueryParam("wordcount") final Integer wordcount) throws JsonProcessingException {
        int wCount = 1 + Math.min(wordcount == null ? 101 : wordcount, 1999);
        String[] words = LOREM.split(" ", wCount);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            String word = words[i];
            stringBuilder.append(word).append(" ");
        }
        String json = "{\"wordCount\":%d,\"text\":\"%s\"}";
        return String.format(json,wordcount, stringBuilder.toString().trim());
    }
}
