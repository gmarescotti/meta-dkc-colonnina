
SUMMARY = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation of comments, seq/map flow style, and map key order"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/code/ci/default/tree"
AUTHOR = "Anthon van der Neut <a.van.der.neut@ruamel.eu>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa0a51dfb461e2f803969e0f3fa71dfe"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/71/81/f597606e81f53eb69330e3f8287e9b5a3f7ed0481824036d550da705cd82/ruamel.yaml-0.17.16.tar.gz"
SRC_URI[md5sum] = "ef2af87b5f265163700b12165a541406"
SRC_URI[sha256sum] = "1a771fc92d3823682b7f0893ad56cb5a5c87c48e62b5399d6f42c8759a583b33"

S = "${WORKDIR}/ruamel.yaml-0.17.16"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
